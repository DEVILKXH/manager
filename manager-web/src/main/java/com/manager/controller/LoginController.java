package com.manager.controller;

import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.manager.entity.User;
import com.manager.entity.UserExample;
import com.manager.inner.dto.AjaxResult;
import com.manager.inner.util.StringUtil;
import com.manager.service.UserService;
import com.manager.util.UserUtil;

@Controller
public class LoginController{

	@Autowired
	private UserService userService;
	
	@Autowired
	private UserUtil userUtil;
	
	@RequestMapping("/index.do")
	public String index(HttpSession session){
		User user = userUtil.getUser(session);
		if(null == user){
			return "login";
		}
		return "index";
	}
	
	@RequestMapping("/login.do")
	public String login(){
		return "login";
	}
	
	@RequestMapping(value = "/doLogin.do",method={RequestMethod.POST})
	@ResponseBody
	public AjaxResult<User> doLogin(User user,HttpServletRequest request,HttpSession session){
		AjaxResult<User> result = new AjaxResult<User>();
		if(StringUtil.isNull(user.getUserName()) || StringUtil.isNull(user.getPassword())){
			result.setStatus("404");
			result.setMessage("帐号或密码不能为空");
			return result;
		}
		UserExample example = new UserExample();
		example.createCriteria().andUserNameEqualTo(user.getUserName());
		List<User> users = userService.selectByExample(example);
		if(null == users || users.size() == 0){
			result.setStatus("404");
			result.setMessage("帐号不存在");
			return result;
		}
		User _user = users.get(0);
		String password = _user.getPassword();
		if(password.equals(user.getPassword())){
			result.setStatus("200");
			result.setMessage("登录成功");
			session.setAttribute("user", _user);
			userUtil.setUser(session, user);
		}else{
			result.setStatus("500");
			result.setMessage("账号或密码错误");
		}
		return result;
	}
	
	@RequestMapping(value = "/logout.do")
	public String doLogout(HttpSession session){
		session.invalidate();
		return "login";
	}
	
	@RequestMapping(value = "/register.do")
	@ResponseBody
	public AjaxResult<User> register(User user,String password2,HttpServletRequest request,HttpSession session){
		AjaxResult<User> result = new AjaxResult<User>();
		if(StringUtil.isNull(user.getUserName()) || StringUtil.isNull(user.getPassword()) || StringUtil.isNull(password2)){
			result.setStatus("404");
			result.setMessage("帐号或密码不能为空");
			return result;
		}
		UserExample example = new UserExample();
		example.createCriteria().andUserNameEqualTo(user.getUserName());
		List<User> users = userService.selectByExample(example);
		if(null != users && users.size() > 0){
			result.setStatus("500");
			result.setMessage("帐号已存在");
			return result;
		}
		if(user.getPassword().length() < 6){
			result.setStatus("500");
			result.setMessage("密码长度不小于6为");
			return result;
		}
		if(!user.getPassword().equals(password2)){
			result.setStatus("500");
			result.setMessage("两次密码不一样");
			return result;
		}
		example.createCriteria().andUserNameEqualTo(user.getUserName());
		List<User> list = userService.selectByExample(example);
		if(null != list && list.size() > 0){
			result.setStatus("500");
			result.setMessage("该用户名已存在");
			return result;
		}
		user.setUuid(UUID.randomUUID().toString());
		int flag = userService.insertSelective(user);
		if(flag == 0){
			result.setStatus("500");
			result.setMessage("插入失败");
		}else{
			result.setStatus("200");
			result.setMessage("插入成功");
			result.setObject(userService.selectByPrimaryKey(user.getUuid()));
		}
		userUtil.addLoginLog(request, session, user);
		userUtil.setUser(session, user);
		return result;
	}
}

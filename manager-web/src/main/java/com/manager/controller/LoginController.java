package com.manager.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.manager.entity.Customer;
import com.manager.entity.Groups;
import com.manager.entity.User;
import com.manager.entity.UserExample;
import com.manager.inner.dto.AjaxResult;
import com.manager.service.CustomerService;
import com.manager.service.GroupService;
import com.manager.service.UserService;
import com.manager.util.UserUtil;
import com.manager.utils.StringUtil;

@Controller
public class LoginController{

	@Autowired
	private UserService userService;
	
	@Autowired
	private GroupService groupService;
	
	@Autowired
	private CustomerService customerService;
	
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
	
	@RequestMapping(value = "/init.do")
	@ResponseBody
	public AjaxResult<String> init(){
		AjaxResult<String> result = new AjaxResult<String>();
		//user
		List<User> users = new ArrayList<User>();
		for(int i = 0; i < 100; i++){
			User user = new User();
			user.setUuid(UUID.randomUUID().toString());
			user.setUserName(getRandom());
			user.setPassword("123456");
			userService.insertSelective(user);
			users.add(user);
		}
		
		//Group
		List<Groups> groups = new ArrayList<Groups>();
		for(int i = 0; i < 10; i++){
			Groups group = new Groups();
			group.setUuid(UUID.randomUUID().toString());
			group.setGroupName(getRandom());
			groupService.insertSelective(group);
			groups.add(group);
		}
		
		//Group
		for(int i = 0; i < 1000; i++){
			Customer customer = new Customer();
			customer.setUuid(UUID.randomUUID().toString());
			customer.setCusName(getRandom());
			Random random = new Random();
			int index = random.nextInt(99);
			int _index = index % 10;
			customer.setUserId(users.get(index).getUuid());
			customer.setGroupId(groups.get(_index).getUuid());
			customerService.insertSelective(customer);
		}
		result.setStatus("200");
		result.setMessage("初始化数据成功");
		return result;
	}

	private String getRandom() {
		String str = "QWERTYUIOPASDFGHJKLZXCVBNM";
		char []rand = new char[6];
		Random random = new Random();
		for(int i = 0; i < rand.length; i++){
			int index = random.nextInt(25);
			char c = str.charAt(index);
			rand[i] = c;
		}
		return String.valueOf(rand);
	}
}

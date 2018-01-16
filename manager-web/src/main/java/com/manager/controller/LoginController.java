package com.manager.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.manager.entity.Customer;
import com.manager.entity.Groups;
import com.manager.entity.Plan;
import com.manager.entity.User;
import com.manager.entity.UserExample;
import com.manager.inner.dto.AjaxResult;
import com.manager.service.CustomerService;
import com.manager.service.GroupService;
import com.manager.service.PlanService;
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
	private PlanService planService;
	
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
	
	@RequestMapping(value = "/doLogin.do")
	@ResponseBody
	public AjaxResult<User> doLogin(@RequestBody User user,HttpServletRequest request){
		AjaxResult<User> result = new AjaxResult<User>();
		HttpSession session = request.getSession();
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
			result.setObject(_user);
			session.setAttribute("user", _user);
//			userUtil.setUser(session,_user);
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
	public AjaxResult<User> register(@RequestBody User user,HttpServletRequest request,HttpSession session){
		String password2 = user.getPassword2();
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
//		String []userName = {"杨炎","杨总","火火","啦啦啦","炎炎"};
		String []userCode = {"yangyan","yangzong","huohuo","lalala","yanyan"};
		String []rank = {"1","3","5","7","9"};
		for(int i = 0; i < 5; i++){
			User user = new User();
			user.setUuid(UUID.randomUUID().toString());
			user.setUserName(userCode[i]);
			user.setUserRank(rank[i]);
			user.setPassword("123456");
			user.setUserStatus("working");
			userService.insertSelective(user);
			users.add(user);
		}
		String []_group = {"分组1","分组2","分组3","分组4","分组5","分组6","分组7","分组8","分组9","分组10"};
		String []_groupCode = {"group1","group2","group3","group4","group5","group6","group7","group8","group9","group10"};
		//Group
		List<Groups> groups = new ArrayList<Groups>();
		for(int i = 0; i < 10; i++){
			Groups group = new Groups();
			group.setUuid(UUID.randomUUID().toString());
			group.setGroupName(_group[i]);
			group.setGroupCode(_groupCode[i]);
			groupService.insertSelective(group);
			groups.add(group);
		}
		
		String []cusName = {"客户1","客户2","客户3","客户4","客户5","客户6","客户7","客户8","客户9","客户10","客户11","客户12","客户13","客户14","客户15","客户16","客户17","客户18","客户19","客户20"};
		String []cusStatus = {"disable","enable","pending"};
		//Group
		for(int i = 0; i < 20; i++){
			Customer customer = new Customer();
			customer.setUuid(UUID.randomUUID().toString());
			customer.setCusName(cusName[i]);
			Random random = new Random();
			int index = random.nextInt(4);
			int _index = random.nextInt(9);
			customer.setUserId(users.get(index).getUuid());
			customer.setGroupId(groups.get(_index).getUuid());
			int status = random.nextInt(2);
			customer.setCusStatus(cusStatus[status]);
			customerService.insertSelective(customer);
		}
		
		for(int i = 0; i < 100; i++){
			Plan plan = new Plan();
			plan.setUuid(UUID.randomUUID().toString());
			plan.setTitle(getRandom());
			plan.setCreateTime(new Date());
			Random random = new Random();
			int index = random.nextInt(99);
			int _index = index % 2;
			plan.setType(_index == 0?"log":"plan");
			plan.setContent(getRandom() + " " + getRandom() + " " + getRandom() + " " + getRandom() + " " + getRandom());
			plan.setUserId(users.get(index).getUuid());
			planService.insertSelective(plan);
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

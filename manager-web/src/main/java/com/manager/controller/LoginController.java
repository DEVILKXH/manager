package com.manager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.manager.entity.User;
import com.manager.entity.UserExample;
import com.manager.service.UserService;

@Controller
@RequestMapping("/login")
public class LoginController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/index.do")
	public String index(){
		return "index";
	}
	
	@RequestMapping("/select.do")
	@ResponseBody
	public User getUser(String uuid){
		return userService.selectByPrimaryKey(uuid);
	}
	
	@RequestMapping("/selectList.do")
	@ResponseBody
	public List<User> getUserList(String uuid){
		UserExample example = new UserExample();
		example.createCriteria().andUserNameEqualTo("123");
		return userService.selectByExample(example);
	}
}

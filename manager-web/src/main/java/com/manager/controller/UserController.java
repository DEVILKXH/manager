/**
 * @author kexiaohong
 * @version 1.0 2017年12月16日
 *
 */
package com.manager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.manager.entity.Customer;
import com.manager.entity.User;
import com.manager.entity.UserExample;
import com.manager.service.UserService;

@Controller
@RequestMapping(value = "/m/user")
public class UserController extends BaseController<UserService,UserExample,User>{
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "index.do")
	public String index(){
		return "user/index";
	}
	
	@RequestMapping(value = "/getCustomerByUserId.do")
	@ResponseBody
	public List<Customer> getCustomerByUserId(User user){
		return userService.getCustomerByUserId(user);
	}
	
	@RequestMapping(value = "/getUserList.do")
	@ResponseBody
	public List<User> getUserList(User user){
		return userService.getUser(user);
	}
	
	@Override
	public UserExample getExample(User user){
		return user.getExample();
	}
}

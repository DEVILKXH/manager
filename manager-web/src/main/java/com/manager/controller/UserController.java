/**
 * @author kexiaohong
 * @version 1.0 2017年12月16日
 *
 */
package com.manager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.manager.entity.User;
import com.manager.entity.UserExample;
import com.manager.entity.UserExample.Criteria;
import com.manager.inner.dto.AjaxResult;
import com.manager.inner.util.StringUtil;
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
	public AjaxResult<User> getCustomerByUserId(User user){
		
		return null;
	}
	
	@Override
	public UserExample getExample(User user){
		UserExample example = new UserExample();
		Criteria criteria = example.createCriteria();
		if(StringUtil.isNotNull(user.getUuid())){
			criteria.andUuidEqualTo(user.getUuid());
		}
		if(StringUtil.isNotNull(user.getUserName())){
			criteria.andUserNameEqualTo(user.getUserName());
		}
		if(StringUtil.isNotNull(user.getUserStatus())){
			criteria.andUserStatusEqualTo(user.getUserStatus());
		}
		if(StringUtil.isNotNull(user.getUserSingal())){
			criteria.andUserSingalEqualTo(user.getUserSingal());
		}
		if(StringUtil.isNotNull(user.getUserRank())){
			criteria.andUserRankEqualTo(user.getUserRank());
		}
		if(StringUtil.isNotNull(user.getUserPhone())){
			criteria.andUserPhoneEqualTo(user.getUserPhone());
		}
		if(StringUtil.isNotNull(user.getUserAddress())){
			criteria.andUserAddressEqualTo(user.getUserAddress());
		}
		if(StringUtil.isNotNull(user.getParentUserId())){
			criteria.andParentUserIdEqualTo(user.getParentUserId());
		}
		return example;
	}
}

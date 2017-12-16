package com.manager.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manager.entity.Customer;
import com.manager.entity.User;
import com.manager.entity.UserExample;
import com.manager.inner.base.serviceimpl.BaseServiceImpl;
import com.manager.mapper.UserMapper;
import com.manager.service.UserService;

@Service
public class UserServiceImpl extends BaseServiceImpl<UserExample, User,UserMapper> implements UserService{

	@Autowired
	private UserMapper userMapper;

	@Override
	public List<Customer> getCustomerByUserId(User user) {
		UserExample example = new UserExample();
		example.createCriteria().andParentUserIdEqualTo(user.getParentUserId());
		List<Customer> customers = new ArrayList<Customer>();
		List<User> users = userMapper.selectByExample(example);
		if(null != users && users.size() == 0){
		}
		return customers;
	}

}

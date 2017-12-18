package com.manager.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manager.entity.Customer;
import com.manager.entity.CustomerExample;
import com.manager.entity.User;
import com.manager.entity.UserExample;
import com.manager.inner.base.serviceimpl.BaseServiceImpl;
import com.manager.mapper.CustomerMapper;
import com.manager.mapper.UserMapper;
import com.manager.service.UserService;

@Service
public class UserServiceImpl extends BaseServiceImpl<UserExample, User,UserMapper> implements UserService{

	@Autowired
	private UserMapper userMapper;
	
	@Autowired
	private CustomerMapper customerMapper;

	/**
	 * 获取当前用户下的所有客户
	 */
	@Override
	public List<Customer> getCustomerByUserId(User user) {
		UserExample example = user.getExample();
		List<Customer> customers = new ArrayList<Customer>();
		List<User> users = userMapper.selectByExample(example);
		if(null != users && users.size() != 0){
			Map<String,User> map = new HashMap<String,User>();
			for(User _user: users){
				map.put(_user.getUuid(), _user);
			}
			List<Customer> cuss = customerMapper.selectByExample(new CustomerExample());
			for(Customer cus: cuss){
				String id = cus.getUserId();
				if(map.containsKey(id)){
					customers.add(cus);
				}
			}
		}
		return customers;
	}

	@Override
	public List<User> getUser(User user) {
		UserExample example = user.getExample();
		List<User> users = userMapper.selectByExample(example);
		if(null == users || users.size() == 0){
			return new ArrayList<User>();
		}
		Map<String,User> map = new HashMap<String,User>();
		for(User _user: users){
			map.put(_user.getUuid(), _user);
		}
		List<Customer> customers = customerMapper.selectByExample(new CustomerExample());
		if(null != customers && customers.size() > 0){
			for(Customer cus: customers){
				String id = cus.getUserId();
				if(map.containsKey(id)){
					map.get(id).addCustomer(cus);
				}
			}
		}
		return users;
	}

}

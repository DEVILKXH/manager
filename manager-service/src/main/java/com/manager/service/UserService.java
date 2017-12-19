package com.manager.service;

import java.util.List;

import com.manager.entity.Customer;
import com.manager.entity.User;
import com.manager.entity.UserExample;
import com.manager.inner.base.service.BaseService;
import com.manager.inner.dto.Page;

public interface UserService extends BaseService<UserExample,User>{
	public List<Customer> getCustomerByUserId(User user);
	
	public List<User> getUser(User user);
	
	public Page<User> getUserPage(User user,Page<User> page);
	
	public Page<User> getUserPageWithCustomer(User user,Page<User> page);
}
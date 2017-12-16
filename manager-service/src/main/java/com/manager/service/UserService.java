package com.manager.service;

import java.util.List;

import com.manager.entity.Customer;
import com.manager.entity.User;
import com.manager.entity.UserExample;
import com.manager.inner.base.service.BaseService;

public interface UserService extends BaseService<UserExample,User>{
	public List<Customer> getCustomerByUserId(User user);
}
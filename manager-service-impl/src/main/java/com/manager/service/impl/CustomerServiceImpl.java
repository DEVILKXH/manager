/**
 * @author kexiaohong
 * @version 1.0 2017年12月18日
 *
 */
package com.manager.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manager.entity.Customer;
import com.manager.entity.CustomerExample;
import com.manager.entity.User;
import com.manager.inner.base.mapper.BaseMapper;
import com.manager.inner.base.serviceimpl.BaseServiceImpl;
import com.manager.inner.dto.Page;
import com.manager.inner.util.PageUtil;
import com.manager.mapper.CustomerMapper;
import com.manager.mapper.UserMapper;

@Service
public class CustomerServiceImpl extends BaseServiceImpl<CustomerExample, Customer, BaseMapper<CustomerExample,Customer>> implements com.manager.service.CustomerService{

	@Autowired
	public CustomerMapper customerMapper;
	
	@Autowired
	public UserMapper userMapper;
	
	@Override
	public Page<Customer> getCustomerPage(Customer customer, Page<Customer> page) {
		User user = userMapper.selectByPrimaryKey(customer.getUserId());
		User _user = new User();
		_user.setUserRank(user.getUserRank());
		_user.setId(user.getUuid());
		List<User> users = userMapper.getUserList(_user);
		if(null == users || users.isEmpty()){
			users = new ArrayList<User>();
		}
		page.setStartAndEnd();
		List<Customer> list = customerMapper.getCustomerPage(customer, page,users);
		int count = customerMapper.count(customer,users);
		page.setList(list);
		page.setCount(count);
		page.setPageResultCount(count);
		PageUtil.getInterval(page);
		return page;
	}

	@Override
	public List<Customer> getCustomerList(Customer customer) {
		User user = userMapper.selectByPrimaryKey(customer.getUserId());
		User _user = new User();
		_user.setUserRank(user.getUserRank());
		List<User> users = userMapper.getUserList(_user);
		if(null == users || users.isEmpty()){
			users = new ArrayList<User>();
		}
		return customerMapper.getCustomerList(customer,users);
	}

}

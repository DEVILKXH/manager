package com.manager.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manager.entity.Customer;
import com.manager.entity.User;
import com.manager.entity.UserExample;
import com.manager.inner.base.serviceimpl.BaseServiceImpl;
import com.manager.inner.dto.Page;
import com.manager.inner.util.PageUtil;
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
			List<Customer> cuss = customerMapper.getCustomerList(new Customer(),null);
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
		List<User> users = userMapper.getUserList(user);
		if(null == users || users.size() == 0){
			return new ArrayList<User>();
		}
		Map<String,User> map = new HashMap<String,User>();
		for(User _user: users){
			map.put(_user.getUuid(), _user);
		}
		List<Customer> customers = customerMapper.getCustomerList(new Customer(),null);
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

	@Override
	public Page<User> getUserPage(User user,Page<User> page) {
		page.setStartAndEnd();
		user = userMapper.selectByPrimaryKey(user.getUuid());
		User _user = new User();
		_user.setId(user.getUuid());
		_user.setUserRank(user.getUserRank());
		List<User> list = userMapper.getUserPage(_user, page);
		int count = userMapper.count(_user);
		page.setList(list);
		page.setCount(count);
		page.setPageResultCount(count);
		PageUtil.getInterval(page);
		return page;
	}

	@Override
	public Page<User> getUserPageWithCustomer(User user, Page<User> page) {
		Page<User> _page = getUserPage(user, page);
		List<User> users = _page.getList();
		List<String> userIds = new ArrayList<String>();
		Map<String,User> map = new HashMap<String,User>();
		for(User _user: users){
			userIds.add(_user.getUuid());
			map.put(_user.getUuid(), _user);
		}
		if(userIds.isEmpty()){
			return _page;
		}
		List<Customer> customers = customerMapper.getCustomerListByInId(userIds);
		if(null != customers && customers.size() > 0){
			for(Customer cus: customers){
				String id = cus.getUserId();
				if(map.containsKey(id)){
					map.get(id).addCustomer(cus);
				}
			}
		}
		return _page;
	}

}

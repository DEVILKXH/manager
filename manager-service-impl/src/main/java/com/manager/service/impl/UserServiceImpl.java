package com.manager.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manager.entity.User;
import com.manager.entity.UserExample;
import com.manager.inner.base.serviceimpl.BaseServiceImpl;
import com.manager.mapper.UserMapper;
import com.manager.service.UserService;

@Service
public class UserServiceImpl extends BaseServiceImpl<UserExample, User,UserMapper> implements UserService{

	@Autowired
	private UserMapper userMapper;

}

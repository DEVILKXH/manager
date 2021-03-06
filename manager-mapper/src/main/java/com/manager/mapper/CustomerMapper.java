package com.manager.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.manager.entity.Customer;
import com.manager.entity.CustomerExample;
import com.manager.entity.User;
import com.manager.inner.base.mapper.BaseMapper;
import com.manager.inner.dto.Page;

public interface CustomerMapper extends BaseMapper<CustomerExample,Customer>{

	public List<Customer> getCustomerPage(@Param("customer") Customer customer, @Param("page")Page<Customer> page,@Param("users") List<User> users);

	public List<Customer> getCustomerList(@Param("customer") Customer customer,@Param("users") List<User> users);
	
	public List<Customer> getCustomerListByInId(List<String> userIds);

	public int count(@Param("customer") Customer customer, @Param("users") List<User> users);
}
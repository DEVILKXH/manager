package com.manager.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.manager.entity.Customer;
import com.manager.entity.CustomerExample;
import com.manager.inner.base.mapper.BaseMapper;
import com.manager.inner.dto.Page;

public interface CustomerMapper extends BaseMapper<CustomerExample,Customer>{

	public List<Customer> getCustomerPage(@Param("customer")Customer customer, @Param("page")Page<Customer> page);

	public List<Customer> getCustomerList(Customer customer);
	
	public List<Customer> getCustomerListByInId(List<String> userIds);
}
/**
 * @author kexiaohong
 * @version 1.0 2017年12月18日
 *
 */
package com.manager.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manager.entity.Customer;
import com.manager.entity.CustomerExample;
import com.manager.inner.base.mapper.BaseMapper;
import com.manager.inner.base.serviceimpl.BaseServiceImpl;
import com.manager.inner.dto.Page;
import com.manager.inner.util.PageUtil;
import com.manager.mapper.CustomerMapper;

@Service
public class CustomerServiceImpl extends BaseServiceImpl<CustomerExample, Customer, BaseMapper<CustomerExample,Customer>> implements com.manager.service.CustomerService{

	@Autowired
	public CustomerMapper customerMapper;
	
	@Override
	public Page<Customer> getCustomerPage(Customer customer, Page<Customer> page) {
		page.setStartAndEnd();
		List<Customer> list = customerMapper.getCustomerPage(customer, page);
		int count = customerMapper.countByExample(customer.getExample());
		page.setList(list);
		page.setCount(count);
		page.setPageResultCount(count);
		PageUtil.getInterval(page);
		return page;
	}

}

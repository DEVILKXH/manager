package com.manager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.manager.entity.Customer;
import com.manager.entity.CustomerExample;
import com.manager.inner.dto.Page;
import com.manager.service.CustomerService;

@Controller
@RequestMapping(value = "/m/customer")
public class CustomerController extends BaseController<CustomerService, CustomerExample, Customer>{

	@Autowired
	private CustomerService customerService;
	
	@RequestMapping(value = "/getCustomerPage.do")
	@ResponseBody
	public Page<Customer> getCustomerPage(Customer customer,Page<Customer> page){
		return customerService.getCustomerPage(customer, page);
	}
	
	@RequestMapping(value = "/getCustomerList.do")
	@ResponseBody
	public List<Customer> getCustomerList(Customer customer){
		return customerService.getCustomerList(customer);
	}
}

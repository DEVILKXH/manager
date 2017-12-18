/**
 * @author kexiaohong
 * @version 1.0 2017年12月18日
 *
 */
package com.manager.service.impl;

import org.springframework.stereotype.Service;

import com.manager.entity.Customer;
import com.manager.entity.CustomerExample;
import com.manager.inner.base.mapper.BaseMapper;
import com.manager.inner.base.serviceimpl.BaseServiceImpl;

@Service
public class CustomerService extends BaseServiceImpl<CustomerExample, Customer, BaseMapper<CustomerExample,Customer>> implements com.manager.service.CustomerService{

}

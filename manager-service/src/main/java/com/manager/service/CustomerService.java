package com.manager.service;

import com.manager.entity.Customer;
import com.manager.entity.CustomerExample;
import com.manager.inner.base.service.BaseService;
import com.manager.inner.dto.Page;

public interface CustomerService extends BaseService<CustomerExample, Customer> {
    public Page<Customer> getCustomerPage(Customer customer,Page<Customer> page);
}
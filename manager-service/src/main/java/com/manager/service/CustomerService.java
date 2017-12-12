package com.manager.service;

import com.manager.entity.Customer;
import com.manager.entity.CustomerExample;
import java.util.List;

public interface CustomerService {
    int countByExample(CustomerExample example);

    int deleteByExample(CustomerExample example);

    int deleteByPrimaryKey(String uuid);

    int insert(Customer record);

    int insertSelective(Customer record);

    List<Customer> selectByExample(CustomerExample example);

    Customer selectByPrimaryKey(String uuid);

    int updateByExampleSelective(Customer record, CustomerExample example);

    int updateByExample(Customer record, CustomerExample example);

    int updateByPrimaryKeySelective(Customer record);

    int updateByPrimaryKey(Customer record);
}
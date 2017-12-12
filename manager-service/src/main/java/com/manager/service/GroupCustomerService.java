package com.manager.service;

import com.manager.entity.GroupCustomer;
import com.manager.entity.GroupCustomerExample;
import java.util.List;

public interface GroupCustomerService {
    int countByExample(GroupCustomerExample example);

    int deleteByExample(GroupCustomerExample example);

    int deleteByPrimaryKey(String uuid);

    int insert(GroupCustomer record);

    int insertSelective(GroupCustomer record);

    List<GroupCustomer> selectByExample(GroupCustomerExample example);

    GroupCustomer selectByPrimaryKey(String uuid);

    int updateByExampleSelective(GroupCustomer record, GroupCustomerExample example);

    int updateByExample(GroupCustomer record, GroupCustomerExample example);

    int updateByPrimaryKeySelective(GroupCustomer record);

    int updateByPrimaryKey(GroupCustomer record);
}
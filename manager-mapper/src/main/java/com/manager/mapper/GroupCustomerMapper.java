package com.manager.mapper;

import com.manager.entity.GroupCustomer;
import com.manager.entity.GroupCustomerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GroupCustomerMapper {
    int countByExample(GroupCustomerExample example);

    int deleteByExample(GroupCustomerExample example);

    int deleteByPrimaryKey(String uuid);

    int insert(GroupCustomer record);

    int insertSelective(GroupCustomer record);

    List<GroupCustomer> selectByExample(GroupCustomerExample example);

    GroupCustomer selectByPrimaryKey(String uuid);

    int updateByExampleSelective(@Param("record") GroupCustomer record, @Param("example") GroupCustomerExample example);

    int updateByExample(@Param("record") GroupCustomer record, @Param("example") GroupCustomerExample example);

    int updateByPrimaryKeySelective(GroupCustomer record);

    int updateByPrimaryKey(GroupCustomer record);
}
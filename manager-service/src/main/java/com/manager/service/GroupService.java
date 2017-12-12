package com.manager.service;

import com.manager.entity.Group;
import com.manager.entity.GroupExample;
import java.util.List;

public interface GroupService {
    int countByExample(GroupExample example);

    int deleteByExample(GroupExample example);

    int deleteByPrimaryKey(Integer uuid);

    int insert(Group record);

    int insertSelective(Group record);

    List<Group> selectByExample(GroupExample example);

    Group selectByPrimaryKey(Integer uuid);

    int updateByExampleSelective(Group record, GroupExample example);

    int updateByExample(Group record, GroupExample example);

    int updateByPrimaryKeySelective(Group record);

    int updateByPrimaryKey(Group record);
}
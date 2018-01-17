package com.manager.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.manager.entity.Groups;
import com.manager.entity.GroupsExample;
import com.manager.inner.base.mapper.BaseMapper;

public interface GroupsMapper extends BaseMapper<GroupsExample, Groups>{
	int countByExample(GroupsExample example);

    int deleteByExample(GroupsExample example);

    int deleteByPrimaryKey(String uuid);

    int insert(Groups record);

    int insertSelective(Groups record);

    List<Groups> selectByExampleWithBLOBs(GroupsExample example);

    List<Groups> selectByExample(GroupsExample example);

    Groups selectByPrimaryKey(String uuid);

    int updateByExampleSelective(@Param("record") Groups record, @Param("example") GroupsExample example);

    int updateByExampleWithBLOBs(@Param("record") Groups record, @Param("example") GroupsExample example);

    int updateByExample(@Param("record") Groups record, @Param("example") GroupsExample example);

    int updateByPrimaryKeySelective(Groups record);

    int updateByPrimaryKeyWithBLOBs(Groups record);

    int updateByPrimaryKey(Groups record);
}
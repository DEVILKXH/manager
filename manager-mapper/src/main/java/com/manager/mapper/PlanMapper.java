package com.manager.mapper;

import com.manager.entity.Plan;
import com.manager.entity.PlanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PlanMapper {
    int countByExample(PlanExample example);

    int deleteByExample(PlanExample example);

    int deleteByPrimaryKey(String uuid);

    int insert(Plan record);

    int insertSelective(Plan record);

    List<Plan> selectByExampleWithBLOBs(PlanExample example);

    List<Plan> selectByExample(PlanExample example);

    Plan selectByPrimaryKey(String uuid);

    int updateByExampleSelective(@Param("record") Plan record, @Param("example") PlanExample example);

    int updateByExampleWithBLOBs(@Param("record") Plan record, @Param("example") PlanExample example);

    int updateByExample(@Param("record") Plan record, @Param("example") PlanExample example);

    int updateByPrimaryKeySelective(Plan record);

    int updateByPrimaryKeyWithBLOBs(Plan record);

    int updateByPrimaryKey(Plan record);
}
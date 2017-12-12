package com.manager.service;

import com.manager.entity.Plan;
import com.manager.entity.PlanExample;
import java.util.List;

public interface PlanService {
    int countByExample(PlanExample example);

    int deleteByExample(PlanExample example);

    int deleteByPrimaryKey(String uuid);

    int insert(Plan record);

    int insertSelective(Plan record);

    List<Plan> selectByExampleWithBLOBs(PlanExample example);

    List<Plan> selectByExample(PlanExample example);

    Plan selectByPrimaryKey(String uuid);

    int updateByExampleSelective(Plan record, PlanExample example);

    int updateByExampleWithBLOBs(Plan record, PlanExample example);

    int updateByExample(Plan record, PlanExample example);

    int updateByPrimaryKeySelective(Plan record);

    int updateByPrimaryKeyWithBLOBs(Plan record);

    int updateByPrimaryKey(Plan record);
}
package com.manager.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.manager.entity.Plan;
import com.manager.entity.PlanExample;
import com.manager.inner.base.mapper.BaseMapper;
import com.manager.inner.dto.Page;

public interface PlanMapper extends BaseMapper<PlanExample, Plan>{
	public List<Plan> getPlanPage(@Param("plan") Plan plan, @Param("page") Page<Plan> page);
	
	public List<Plan> getPlanList(Plan plan);
}
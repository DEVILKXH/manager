package com.manager.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manager.entity.Plan;
import com.manager.entity.PlanExample;
import com.manager.entity.User;
import com.manager.inner.base.mapper.BaseMapper;
import com.manager.inner.base.serviceimpl.BaseServiceImpl;
import com.manager.inner.dto.Page;
import com.manager.inner.util.PageUtil;
import com.manager.mapper.PlanMapper;
import com.manager.service.PlanService;

@Service
public class PlanServiceImpl extends BaseServiceImpl<PlanExample, Plan, BaseMapper<PlanExample,Plan>> implements PlanService{

	@Autowired
	private PlanMapper planMapper;
	
	@Override
	public Page<Plan> getPlanPage(Plan plan, Page<Plan> page,List<User> users) {
		page.setStartAndEnd();
		List<Plan> list = planMapper.getPlanPage(plan, page,users);
		int count = planMapper.count(plan,users);
		page.setList(list);
		page.setCount(count);
		page.setPageResultCount(count);
		PageUtil.getInterval(page);
		return page;
	}

	@Override
	public List<Plan> getPlanList(Plan plan,List<User> users) {
		return planMapper.getPlanList(plan,users);
	}
}

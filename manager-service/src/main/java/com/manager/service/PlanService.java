package com.manager.service;

import java.util.List;

import com.manager.entity.Plan;
import com.manager.entity.PlanExample;
import com.manager.entity.User;
import com.manager.inner.base.service.BaseService;
import com.manager.inner.dto.Page;

public interface PlanService extends BaseService<PlanExample,Plan>{
    public Page<Plan> getPlanPage(Plan plan,Page<Plan> page,List<User> users);
    
    public List<Plan> getPlanList(Plan plan,List<User> users);
}
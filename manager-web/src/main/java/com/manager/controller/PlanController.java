package com.manager.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.manager.entity.Plan;
import com.manager.entity.PlanExample;
import com.manager.inner.dto.Page;
import com.manager.service.PlanService;
import com.manager.utils.StringUtil;

@Controller
@RequestMapping(value = "/m/plan")
public class PlanController extends BaseController<PlanService, PlanExample, Plan>{

	@Autowired
	private PlanService planService;

	@RequestMapping(value = "/getPlanPage.do")
	@ResponseBody
	public Page<Plan> getPlanPage(Plan plan, Page<Plan> page,String createTime2){
		if(StringUtil.isNotNull(createTime2)){
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			Date date = new Date();
			try {
				date = sdf.parse(createTime2);
			} catch (ParseException e) {
				
			}
			plan.setCreateTime(date);
		}
		return planService.getPlanPage(plan, page);
	}
	
	@RequestMapping(value = "/getList.do")
	@ResponseBody
	public List<Plan> getList(Plan plan,String createTime2){
		if(StringUtil.isNotNull(createTime2)){
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			Date date = new Date();
			try {
				date = sdf.parse(createTime2);
			} catch (ParseException e) {
				
			}
			plan.setCreateTime(date);
		}
		return planService.selectByExample(plan.getExample());
	}
}

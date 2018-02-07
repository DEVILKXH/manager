package com.manager.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.manager.entity.Plan;
import com.manager.entity.PlanExample;
import com.manager.entity.User;
import com.manager.inner.dto.Page;
import com.manager.service.PlanService;
import com.manager.service.UserService;
import com.manager.utils.StringUtil;

@Controller
@RequestMapping(value = "/m/plan")
public class PlanController extends BaseController<PlanService, PlanExample, Plan>{

	@Autowired
	private PlanService planService;
	
	@Autowired
	private UserService userService;

	@RequestMapping(value = "/getPlanPage.do")
	@ResponseBody
	public Page<Plan> getPlanPage(Plan plan, Page<Plan> page,String createTime2,String myDoc){
		if(StringUtil.isNotNull(createTime2)){
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			Date date = new Date();
			try {
				date = sdf.parse(createTime2);
			} catch (ParseException e) {
				
			}
			plan.setCreateTime(date);
		}
		
		
		User user = userService.selectByPrimaryKey(plan.getUserId());
		List<User> users = new ArrayList<User>();
		if("self".equals(myDoc)){
			users.add(user);
		}else{
			User _user = new User();
			_user.setUserRank(user.getUserRank());
			_user.setId(user.getUuid());
			users = userService.getUser(_user);
			if(null == users || users.isEmpty()){
				users = new ArrayList<User>();
			}
		}
		return planService.getPlanPage(plan, page,users);
	}
	
	@RequestMapping(value = "/getList.do")
	@ResponseBody
	public List<Plan> getList(Plan plan,String createTime2,String type){
		if(StringUtil.isNotNull(createTime2)){
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			Date date = new Date();
			try {
				date = sdf.parse(createTime2);
			} catch (ParseException e) {
				
			}
			plan.setCreateTime(date);
		}
		User user = userService.selectByPrimaryKey(plan.getUserId());
		User _user = new User();
		_user.setUserRank(user.getUserRank());
		_user.setId(user.getUuid());
		List<User> users = userService.getUser(_user);
		if(null == users || users.isEmpty()){
			users = new ArrayList<User>();
		}
		return planService.getPlanList(plan,users);
	}
	
}

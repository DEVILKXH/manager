package com.manager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.manager.entity.Expanse;
import com.manager.entity.ExpanseExample;
import com.manager.entity.User;
import com.manager.inner.dto.Page;
import com.manager.service.ExpanseService;
import com.manager.service.UserService;

@Controller
@RequestMapping(value = "/m/expanse")
public class ExpanseController extends BaseController<ExpanseService, ExpanseExample, Expanse>{

	@Autowired
	private ExpanseService expanseService;
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/getPage.do")
	@ResponseBody
	public Page<Expanse> getPage(Expanse record, Page<Expanse> page){
		User user = userService.selectByPrimaryKey(record.getUserId());
		int rank = Integer.parseInt(user.getUserRank());
		if(rank <= 1){
			record.setUserId(null);
		}
		return expanseService.getPage(record, page);
	}
	
	@RequestMapping(value = "/getLists.do")
	@ResponseBody
	public List<Expanse> getList(Expanse record){
		User user = userService.selectByPrimaryKey(record.getUserId());
		int rank = Integer.parseInt(user.getUserRank());
		if(rank <= 1){
			record.setUserId(null);
		}
		return expanseService.getList(record);
	}
}

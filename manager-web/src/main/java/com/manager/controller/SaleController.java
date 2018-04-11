package com.manager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.manager.entity.Sale;
import com.manager.entity.SaleExample;
import com.manager.entity.User;
import com.manager.inner.dto.Page;
import com.manager.service.SaleService;
import com.manager.service.UserService;

@Controller
@RequestMapping(value = "/m/sale")
public class SaleController extends BaseController<SaleService, SaleExample, Sale>{

	@Autowired
	private SaleService saleService;
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/getPage.do")
	@ResponseBody
	public Page<Sale> getPage(Sale record, Page<Sale> page){
		User user = userService.selectByPrimaryKey(record.getUserId());
		int rank = Integer.parseInt(user.getUserRank());
		if(rank <= 1){
			record.setUserId(null);
		}
		return saleService.getPage(record, page);
	}
	
	@RequestMapping(value = "/getLists.do")
	@ResponseBody
	public List<Sale> getList(Sale record){
		User user = userService.selectByPrimaryKey(record.getUserId());
		int rank = Integer.parseInt(user.getUserRank());
		if(rank <= 1){
			record.setUserId(null);
		}
		return saleService.getList(record);
	}
	
	@RequestMapping(value = "/getSaleComp.do")
	@ResponseBody
	public List<Sale> getSaleComp(){
		return saleService.getSaleComp();
	}
}

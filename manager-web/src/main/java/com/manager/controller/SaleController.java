package com.manager.controller;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.manager.entity.Sale;
import com.manager.entity.SaleExample;
import com.manager.entity.User;
import com.manager.inner.dto.EchartLine;
import com.manager.inner.dto.EchartLineResult;
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
	public EchartLineResult getSaleComp(Sale record){
		User user = userService.selectByPrimaryKey(record.getUserId());
		int rank = Integer.parseInt(user.getUserRank());
		if(rank <= 1){
			record.setUserId(null);
		}
		List<Sale> sales = saleService.getSaleComp(record);
		Map<String, EchartLine> map = new HashMap<>();
		EchartLineResult result = new EchartLineResult();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		for(Sale sale: sales){
			
			EchartLine line = new EchartLine();
			String key = sale.getUserId();
			if(map.containsKey(key)){
				line = map.get(key);
			}else{
				map.put(key, line);
				result.addSeries(line);
			}
			line.addData(sale.getItemPrice().toString());
			line.setName(sale.getUserName());
			result.addxAxisData(sdf.format(sale.getItemTime()));
			result.addLedgendData(sale.getUserName());
		}
		System.out.println(JSONObject.toJSONString(result.getAxisData()));
		return result;
	}
}

package com.manager.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manager.entity.Sale;
import com.manager.entity.SaleExample;
import com.manager.inner.base.serviceimpl.BaseServiceImpl;
import com.manager.mapper.SaleMapper;
import com.manager.service.SaleService;

@Service
public class SaleServiceImpl extends BaseServiceImpl<SaleExample, Sale, SaleMapper> implements SaleService{

	@Autowired
	private SaleMapper saleMapper;
	
	@Override
	public List<Sale> getSaleComp() {
		return saleMapper.getSaleComp();
	}

}

package com.manager.mapper;

import java.util.List;

import com.manager.entity.Sale;
import com.manager.entity.SaleExample;
import com.manager.inner.base.mapper.BaseMapper;

public interface SaleMapper extends BaseMapper<SaleExample, Sale>{
	public List<Sale> getSaleComp(Sale record);
}
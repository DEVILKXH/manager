package com.manager.service;

import java.util.List;

import com.manager.entity.Sale;
import com.manager.entity.SaleExample;
import com.manager.inner.base.service.BaseService;

public interface SaleService extends BaseService<SaleExample, Sale>{
	public List<Sale> getSaleComp();
}

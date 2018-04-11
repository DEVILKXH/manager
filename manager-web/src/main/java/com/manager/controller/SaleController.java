package com.manager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.manager.entity.Sale;
import com.manager.entity.SaleExample;
import com.manager.service.SaleService;

@Controller
@RequestMapping(value = "/m/sale")
public class SaleController extends BaseController<SaleService, SaleExample, Sale>{

}

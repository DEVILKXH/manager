package com.manager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.manager.entity.Expanse;
import com.manager.entity.ExpanseExample;
import com.manager.service.ExpanseService;

@Controller
@RequestMapping(value = "/m/expanse")
public class ExpanseController extends BaseController<ExpanseService, ExpanseExample, Expanse>{

}

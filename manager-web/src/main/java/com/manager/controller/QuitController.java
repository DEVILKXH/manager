package com.manager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.manager.entity.Quit;
import com.manager.entity.QuitExample;
import com.manager.service.QuitService;

@Controller
@RequestMapping(value = "/m/quit")
public class QuitController extends BaseController<QuitService, QuitExample, Quit>{

}

package com.manager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.manager.entity.Item;
import com.manager.entity.ItemExample;
import com.manager.service.ItemService;

@Controller
@RequestMapping(value = "/m/item")
public class ItemController extends BaseController<ItemService, ItemExample, Item>{

}


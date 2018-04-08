package com.manager.service.impl;

import org.springframework.stereotype.Service;

import com.manager.entity.Item;
import com.manager.entity.ItemExample;
import com.manager.inner.base.serviceimpl.BaseServiceImpl;
import com.manager.mapper.ItemMapper;
import com.manager.service.ItemService;

@Service
public class ItemServiceImpl extends BaseServiceImpl<ItemExample, Item, ItemMapper> implements ItemService{

}

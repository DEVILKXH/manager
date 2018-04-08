package com.manager.service.impl;

import org.springframework.stereotype.Service;

import com.manager.entity.Expanse;
import com.manager.entity.ExpanseExample;
import com.manager.inner.base.serviceimpl.BaseServiceImpl;
import com.manager.mapper.ExpanseMapper;
import com.manager.service.ExpanseService;

@Service
public class ExpanseServiceImpl extends BaseServiceImpl<ExpanseExample, Expanse, ExpanseMapper> implements ExpanseService{

}

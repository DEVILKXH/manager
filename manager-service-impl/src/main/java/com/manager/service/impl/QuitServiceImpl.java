package com.manager.service.impl;

import org.springframework.stereotype.Service;

import com.manager.entity.Quit;
import com.manager.entity.QuitExample;
import com.manager.inner.base.serviceimpl.BaseServiceImpl;
import com.manager.mapper.QuitMapper;
import com.manager.service.QuitService;

@Service
public class QuitServiceImpl extends BaseServiceImpl<QuitExample, Quit, QuitMapper> implements QuitService{

}

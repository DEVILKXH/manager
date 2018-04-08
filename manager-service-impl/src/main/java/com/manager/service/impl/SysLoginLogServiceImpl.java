/**
 * @author kexiaohong
 * @version 1.0 2017年12月16日
 *
 */
package com.manager.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manager.entity.SysLoginLog;
import com.manager.entity.SysLoginLogExample;
import com.manager.inner.dto.Page;
import com.manager.mapper.SysLoginLogMapper;
import com.manager.service.SysLoginLogService;

@Service("sysLoginLogService")
public class SysLoginLogServiceImpl implements SysLoginLogService{

	@Autowired
	private SysLoginLogMapper sysLoginLogMapper;
	
	@Override
	public int countByExample(SysLoginLogExample example) {
		return sysLoginLogMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(SysLoginLogExample example) {
		return sysLoginLogMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(String logId) {
		return sysLoginLogMapper.deleteByPrimaryKey(logId);
	}

	@Override
	public int insert(SysLoginLog record) {
		return sysLoginLogMapper.insert(record);
	}

	@Override
	public int insertSelective(SysLoginLog record) {
		return sysLoginLogMapper.insertSelective(record);
	}

	@Override
	public List<SysLoginLog> selectByExample(SysLoginLogExample example) {
		return sysLoginLogMapper.selectByExample(example);
	}

	@Override
	public SysLoginLog selectByPrimaryKey(String logId) {
		return sysLoginLogMapper.selectByPrimaryKey(logId);
	}

	@Override
	public int updateByExampleSelective(SysLoginLog record, SysLoginLogExample example) {
		return sysLoginLogMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(SysLoginLog record, SysLoginLogExample example) {
		return sysLoginLogMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(SysLoginLog record) {
		return sysLoginLogMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(SysLoginLog record) {
		return sysLoginLogMapper.updateByPrimaryKey(record);
	}

	@Override
	public Page<SysLoginLog> getPage(SysLoginLog record, Page<SysLoginLog> page) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SysLoginLog> getList(SysLoginLog record) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int count(SysLoginLog record) {
		// TODO Auto-generated method stub
		return 0;
	}

}

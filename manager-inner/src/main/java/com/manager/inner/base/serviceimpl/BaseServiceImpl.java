/**
 * @author kexiaohong
 * @version 1.0 2017年12月16日
 *
 */
package com.manager.inner.base.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.manager.inner.base.mapper.BaseMapper;
import com.manager.inner.base.service.BaseService;

public class BaseServiceImpl<T, E,K extends BaseMapper<T,E>> implements BaseService<T, E>{

	@Autowired
	private K mapper;
	
	@Override
	public int countByExample(T example) {
		return mapper.countByExample(example);
	}

	@Override
	public int deleteByExample(T example) {
		return mapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(String uuid) {
		return mapper.deleteByPrimaryKey(uuid);
	}

	@Override
	public int insert(E record) {
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(E record) {
		return mapper.insertSelective(record);
	}

	@Override
	public List<E> selectByExample(T example) {
		return mapper.selectByExample(example);
	}

	@Override
	public E selectByPrimaryKey(String uuid) {
		return mapper.selectByPrimaryKey(uuid);
	}

	@Override
	public int updateByExampleSelective(E record, T example) {
		return mapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(E record, T example) {
		return mapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(E record) {
		return mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(E record) {
		return mapper.updateByPrimaryKey(record);
	}

}

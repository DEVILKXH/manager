package com.manager.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.manager.entity.Quit;
import com.manager.entity.QuitExample;
import com.manager.inner.base.mapper.BaseMapper;
import com.manager.inner.dto.Page;

public interface QuitMapper extends BaseMapper<QuitExample, Quit>{
	public List<Quit> getPage(@Param("quit") Quit quit, @Param("page")Page<Quit> page);

	public List<Quit> getList(@Param("quit") Quit quit);
	
	public int count(@Param("quit") Quit quit);
}
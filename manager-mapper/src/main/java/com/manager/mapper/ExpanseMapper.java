package com.manager.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.manager.entity.Expanse;
import com.manager.entity.ExpanseExample;
import com.manager.inner.base.mapper.BaseMapper;
import com.manager.inner.dto.Page;

public interface ExpanseMapper extends BaseMapper<ExpanseExample,Expanse>{
	public List<Expanse> getPage(@Param("expanse") Expanse expanse, @Param("page")Page<Expanse> page);

	public List<Expanse> getList(@Param("expanse") Expanse expanse);
	
	public int count(@Param("expanse") Expanse expanse);

}
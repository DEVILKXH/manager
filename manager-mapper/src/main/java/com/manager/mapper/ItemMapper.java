package com.manager.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.manager.entity.Item;
import com.manager.entity.ItemExample;
import com.manager.inner.base.mapper.BaseMapper;
import com.manager.inner.dto.Page;

public interface ItemMapper extends BaseMapper<ItemExample, Item>{
	public List<Item> getPage(@Param("item") Item item, @Param("page")Page<Item> page);

	public List<Item> getList(@Param("item") Item item);
	
	public int count(@Param("item") Item item);
}
/**
 * @author kexiaohong
 * @version 1.0 2017年12月16日
 *
 */
package com.manager.inner.base.service;

import java.util.List;

import com.manager.inner.dto.Page;


public interface BaseService<T,E> {
	
	int countByExample(T example);

    int deleteByExample(T example);

    int deleteByPrimaryKey(String uuid);

    int insert(E record);

    int insertSelective(E record);

    List<E> selectByExample(T example);

    E selectByPrimaryKey(String uuid);

    int updateByExampleSelective(E record, T example);

    int updateByExample(E record, T example);

    int updateByPrimaryKeySelective(E record);

    int updateByPrimaryKey(E record);
    
    Page<E> getPage(E record, Page<E> page);

	List<E> getList(E record);
	
	int count(E record);
}

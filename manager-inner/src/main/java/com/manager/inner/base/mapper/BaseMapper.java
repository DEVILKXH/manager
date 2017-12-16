/**
 * @author kexiaohong
 * @version 1.0 2017年12月16日
 *
 */
package com.manager.inner.base.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;


public interface BaseMapper<T,E> {
	int countByExample(T example);

    int deleteByExample(T example);

    int deleteByPrimaryKey(String uuid);

    int insert(E record);

    int insertSelective(E record);

    List<E> selectByExample(T example);

    E selectByPrimaryKey(String uuid);

    int updateByExampleSelective(@Param("record") E record, @Param("example") T example);

    int updateByExample(@Param("record") E record, @Param("example") T example);

    int updateByPrimaryKeySelective(E record);

    int updateByPrimaryKey(E record);
}

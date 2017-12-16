/**
 * @author kexiaohong
 * @version 1.0 2017年12月16日
 *
 */
package com.manager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.manager.base.entity.BaseEntity;
import com.manager.inner.base.service.BaseService;
import com.manager.inner.dto.AjaxResult;

public class BaseController<S extends BaseService<T,E>, T, E> {
	
	@Autowired
	private S service;
	
	@RequestMapping(value = "/selectOne.do")
	@ResponseBody
	public E selectOne(E E){
		T example =  getExample(E);
		List<E> Es = service.selectByExample(example);
		if(null == Es || Es.size() == 0 ){
			return null;
		}
		return Es.get(0);
	}
	
	@RequestMapping(value = "/update.do")
	@ResponseBody
	public AjaxResult<E> update(E record){
		BaseEntity baseEntity = (BaseEntity) record;
		AjaxResult<E> ajax = new AjaxResult<E>();
		int flag = service.updateByPrimaryKey(record);
		if(flag == 0){
			ajax.setStatus("500");
			ajax.setMessage("更新失败");
		}else{
			ajax.setStatus("200");
			ajax.setMessage("更新成功");
			ajax.setObject(service.selectByPrimaryKey(baseEntity.getUuid()));
		}
		return ajax;
	}
	
	@RequestMapping(value = "/delete.do")
	@ResponseBody
	public AjaxResult<E> delete(E record){
		AjaxResult<E> ajax = new AjaxResult<E>();
		BaseEntity baseEntity = (BaseEntity) record;
		int flag = service.deleteByPrimaryKey(baseEntity.getUuid());
		if(flag == 0){
			ajax.setStatus("500");
			ajax.setMessage("删除失败");
		}else{
			ajax.setStatus("200");
			ajax.setMessage("删除成功");
		}
		return ajax;
	}
	
	public T getExample(E record){
		return null;
	}
}

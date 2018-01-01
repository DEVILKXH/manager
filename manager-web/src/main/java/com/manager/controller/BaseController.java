/**
 * @author kexiaohong
 * @version 1.0 2017年12月16日
 *
 */
package com.manager.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.manager.base.entity.BaseEntity;
import com.manager.entity.User;
import com.manager.entity.UserExample;
import com.manager.inner.base.service.BaseService;
import com.manager.inner.dto.AjaxResult;
import com.manager.service.UserService;

public class BaseController<S extends BaseService<T,E>, T, E> {
	
	@Autowired
	private S service;
	
	@RequestMapping(value = "/insertSelective.do",method={RequestMethod.POST})
	@ResponseBody
	public AjaxResult<E> insertSelective(@RequestBody E record){
		AjaxResult<E> ajax = new AjaxResult<E>();
		if(record.getClass()  == User.class){
			User user = (User)record;
			UserExample example = new UserExample();
			example.createCriteria().andUserNameEqualTo(user.getUserName());
			UserService userService = (UserService) service;
			List<User> list = userService.selectByExample(example);
			if(null != list && list.size() > 0){
				ajax.setStatus("500");
				ajax.setMessage("该用户名已存在");
				return ajax;
			}
		}
		BaseEntity baseEntity = (BaseEntity)record;
		baseEntity.setUuid(UUID.randomUUID().toString());
		int flag = service.insertSelective(record);
		if(flag == 0){
			ajax.setStatus("500");
			ajax.setMessage("插入失败");
		}else{
			ajax.setStatus("200");
			ajax.setMessage("插入成功");
			ajax.setObject(service.selectByPrimaryKey(baseEntity.getUuid()));
		}
		return ajax;
	}
	
	@RequestMapping(value = "/insert.do",method={RequestMethod.POST})
	@ResponseBody
	public AjaxResult<E> insert(@RequestBody E record){
		AjaxResult<E> ajax = new AjaxResult<E>();
		if(record.getClass()  == User.class){
			User user = (User)record;
			UserExample example = new UserExample();
			example.createCriteria().andUserNameEqualTo(user.getUserName());
			UserService userService = (UserService) service;
			List<User> list = userService.selectByExample(example);
			if(null != list && list.size() > 0){
				ajax.setStatus("500");
				ajax.setMessage("该用户名已存在");
				return ajax;
			}
		}
		BaseEntity baseEntity = (BaseEntity)record;
		baseEntity.setUuid(UUID.randomUUID().toString());
		int flag = service.insert(record);
		if(flag == 0){
			ajax.setStatus("500");
			ajax.setMessage("插入失败");
		}else{
			ajax.setStatus("200");
			ajax.setMessage("插入成功");
			ajax.setObject(service.selectByPrimaryKey(baseEntity.getUuid()));
		}
		return ajax;
	}
	
	@RequestMapping(value = "/selectOne.do",method={RequestMethod.POST})
	@ResponseBody
	public E selectOne(@RequestBody E record){
		T example =  getExample(record);
		List<E> records = service.selectByExample(example);
		if(null == records || records.size() == 0 ){
			return null;
		}
		return records.get(0);
	}
	
	@RequestMapping(value = "/updateSelective.do",method={RequestMethod.POST})
	@ResponseBody
	public AjaxResult<E> updateSelective(@RequestBody E record){
		BaseEntity baseEntity = (BaseEntity) record;
		AjaxResult<E> ajax = new AjaxResult<E>();
		int flag = service.updateByPrimaryKeySelective(record);
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
	
	@RequestMapping(value = "/update.do",method={RequestMethod.POST})
	@ResponseBody
	public AjaxResult<E> update(@RequestBody E record){
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
	
	@RequestMapping(value = "/delete.do",method={RequestMethod.POST})
	@ResponseBody
	public AjaxResult<E> delete(@RequestBody E record){
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

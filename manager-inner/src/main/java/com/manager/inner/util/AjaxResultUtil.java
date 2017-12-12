package com.manager.inner.util;

import org.springframework.stereotype.Component;

import com.manager.inner.dto.AjaxResult;


@Component
public class AjaxResultUtil {

	public <T> AjaxResult<T> getAjaxResult(Class<T> T){
		return new AjaxResult<T>();
	}
}

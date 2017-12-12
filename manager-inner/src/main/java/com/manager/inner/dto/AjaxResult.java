package com.manager.inner.dto;

import java.util.List;

public class AjaxResult<T> {
	
	private String status;
	
	private String message;
	
	private List<T> result;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<T> getResult() {
		return result;
	}

	public void setResult(List<T> result) {
		this.result = result;
	}

}

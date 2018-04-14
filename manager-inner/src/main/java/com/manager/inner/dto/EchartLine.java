package com.manager.inner.dto;

import java.util.ArrayList;
import java.util.List;

public class EchartLine {

	private String name;
	private String type = "line";
	private String stack;
	private List<String> data = new ArrayList<>();
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getStack() {
		return stack;
	}
	public void setStack(String stack) {
		this.stack = stack;
	}
	public List<String> getData() {
		return data;
	}
	public void setData(List<String> data) {
		this.data = data;
	}
	
	public void addData(String value){
		this.data.add(value);
	}
}

package com.manager.inner.dto;

import java.util.List;

public class Page<T>{

	private String key;
	
	private int page = 1;
	
	private int pageNum = 1;
	
	private int pageSize = 10;
	
	private int start = 0;
	
	private int end = 0;
	
	private int limit = 10;
	
	private long count = 0;
	
	private long pageResultCount = 0;
	
	private List<T> list;

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}
	
	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getEnd() {
		return end;
	}

	public void setEnd(int end) {
		this.end = end;
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	public long getCount() {
		return count;
	}

	public void setCount(long count) {
		this.count = count;
	}

	public long getPageResultCount() {
		return pageResultCount;
	}

	public void setPageResultCount(long pageResultCount) {
		if(pageResultCount % this.pageSize == 0){
			this.pageResultCount = pageResultCount / this.pageSize;
		}else{
			this.pageResultCount = pageResultCount / this.pageSize + 1; 
		}
	}

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}

	public void setStartAndEnd() {
		this.end = this.pageSize * this.page;
		this.start = this.end - this.pageSize;
	}
	
}

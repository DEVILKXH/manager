package com.manager.inner.dto;

import java.util.Map;

import org.bson.Document;

public class Searcher{
	
	private Map<String,Object> searcher;
	
	private String operation;
	
	public Map<String, Object> getSearcher() {
		return searcher;
	}

	public void setSearcher(Map<String, Object> searcher) {
		this.searcher = searcher;
	}
	
	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public Document toDocument() {
		Document document = new Document();
		if(searcher != null){
			for(String key: searcher.keySet()){
				document.append(key, searcher.get(key));
			}
		}
		return document;
	}
	
}

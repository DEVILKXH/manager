/**
 * @author kexiaohong
 * @version 1.0 2017年12月16日
 *
 */
package com.manager.base.entity;

public class BaseEntity {

	private String uuid;

	private String name;
	
	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		 this.uuid = uuid == null ? null : uuid.trim();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

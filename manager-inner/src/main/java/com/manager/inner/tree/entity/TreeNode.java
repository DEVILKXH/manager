/**
 * @author kexiaohong
 * @version 1.0 2017年12月6日
 *
 */
package com.manager.inner.tree.entity;

import java.util.ArrayList;
import java.util.List;

public class TreeNode {
	private String id;
	
	private String fdParentId;
	
	private String fdName;
	
	private String value;
	
	private String url;
	
	private String img;
	
	private String fdNo;
	
	private String fdIsAvailable;
	
	private List<TreeNode> children;

	public TreeNode(){
		this.children = new ArrayList<TreeNode>();
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFdParentId() {
		return fdParentId;
	}

	public void setFdParentId(String fdParentId) {
		this.fdParentId = fdParentId;
	}

	public String getFdName() {
		return fdName;
	}

	public void setFdName(String fdName) {
		this.fdName = fdName;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getFdNo() {
		return fdNo;
	}

	public void setFdNo(String fdNo) {
		this.fdNo = fdNo;
	}

	public String getFdIsAvailable() {
		return fdIsAvailable;
	}

	public void setFdIsAvailable(String fdIsAvailable) {
		this.fdIsAvailable = fdIsAvailable;
	}

	public List<TreeNode> getChildren() {
		return children;
	}

	public void setChildren(List<TreeNode> children) {
		this.children = children;
	}
	
	public void addChildren(TreeNode node){
		this.children.add(node);
	}
}

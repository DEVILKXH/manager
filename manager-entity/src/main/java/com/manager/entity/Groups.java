package com.manager.entity;

import java.util.ArrayList;
import java.util.List;

import com.manager.base.entity.BaseEntity;
import com.manager.entity.GroupsExample.Criteria;
import com.manager.utils.StringUtil;

public class Groups extends BaseEntity{

    private String groupName;

    private String groupCode;

    private String parentGroupId;

    private List<Customer> cus;
    
    public Groups(){
    	cus = new ArrayList<Customer>();
    }
    
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName == null ? null : groupName.trim();
    }

    public String getGroupCode() {
        return groupCode;
    }

    public void setGroupCode(String groupCode) {
        this.groupCode = groupCode == null ? null : groupCode.trim();
    }

    public String getParentGroupId() {
        return parentGroupId;
    }

    public void setParentGroupId(String parentGroupId) {
        this.parentGroupId = parentGroupId;
    }
    
    
    public List<Customer> getCus() {
		return cus;
	}

	public void setCus(List<Customer> cus) {
		this.cus = cus;
	}
	
	public void addCustomer(Customer cus){
		this.cus.add(cus);
	}

	public GroupsExample getExample(){
  		GroupsExample example = new GroupsExample();
  		Criteria criteria = example.createCriteria();
  		if(StringUtil.isNotNull(this.getUuid())){
  			criteria.andUuidEqualTo(this.getUuid());
  		}
  		if(StringUtil.isNotNull(this.groupCode)){
  			criteria.andUuidEqualTo(this.groupCode);
  		}
  		if(StringUtil.isNotNull(this.groupName)){
  			criteria.andGroupNameEqualTo(this.groupName);
  		}
  		if(StringUtil.isNotNull(this.parentGroupId)){
  			criteria.andParentGroupIdEqualTo(this.parentGroupId);
  		}
  		return example;
  	}
}
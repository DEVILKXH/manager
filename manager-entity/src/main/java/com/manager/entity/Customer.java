package com.manager.entity;

import java.util.Date;

import com.manager.base.entity.BaseEntity;
import com.manager.entity.CustomerExample.Criteria;
import com.manager.utils.StringUtil;

public class Customer extends BaseEntity{

    private String cusName;

    private Date cusBirthday;

    private String cusPhone;

    private String cusStatus;

    private String cusAddress;

    private String userId;

    private String userName;
    
    private String groupId;
    
    private String groupName;
    
    private String groupDesp;
    
    private String cusType;
    
    private String busType;

    public String getCusName() {
        return cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName == null ? null : cusName.trim();
    }

    public Date getCusBirthday() {
        return cusBirthday;
    }

    public void setCusBirthday(Date cusBirthday) {
        this.cusBirthday = cusBirthday;
    }

    public String getCusPhone() {
        return cusPhone;
    }

    public void setCusPhone(String cusPhone) {
        this.cusPhone = cusPhone == null ? null : cusPhone.trim();
    }

    public String getCusStatus() {
        return cusStatus;
    }

    public void setCusStatus(String cusStatus) {
        this.cusStatus = cusStatus == null ? null : cusStatus.trim();
    }

    public String getCusAddress() {
        return cusAddress;
    }

    public void setCusAddress(String cusAddress) {
        this.cusAddress = cusAddress == null ? null : cusAddress.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getGroupId() {
        return groupId;
    }

    
    public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public void setGroupId(String groupId) {
        this.groupId = groupId == null ? null : groupId.trim();
    }
    
    public String getGroupDesp() {
		return groupDesp;
	}

	public void setGroupDesp(String groupDesp) {
		this.groupDesp = groupDesp;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getCusType() {
		return cusType;
	}

	public void setCusType(String cusType) {
		this.cusType = cusType;
	}

	public String getBusType() {
		return busType;
	}

	public void setBusType(String busType) {
		this.busType = busType;
	}

	public CustomerExample getExample(){
    	CustomerExample example = new CustomerExample();
    	Criteria criteria =  example.createCriteria();
    	if(StringUtil.isNotNull(this.getUuid())){
    		criteria.andUuidEqualTo(this.getUuid());
    	}
    	if(StringUtil.isNotNull(this.cusAddress)){
    		criteria.andCusAddressEqualTo(this.cusAddress);
    	}
    	if(StringUtil.isNotNull(this.cusName)){
    		criteria.andCusNameEqualTo(this.cusName);
    	}
    	if(StringUtil.isNotNull(this.cusPhone)){
    		criteria.andCusPhoneEqualTo(this.cusPhone);
    	}
    	if(StringUtil.isNotNull(this.cusStatus)){
    		criteria.andCusStatusEqualTo(this.cusStatus);
    	}
    	if(StringUtil.isNotNull(this.groupId)){
    		criteria.andGroupIdEqualTo(this.groupId);
    	}
    	if(StringUtil.isNotNull(this.userId)){
    		criteria.andUserIdEqualTo(this.userId);
    	}
    	return example;
    }
}
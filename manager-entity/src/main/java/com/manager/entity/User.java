package com.manager.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.manager.base.entity.BaseEntity;
import com.manager.entity.UserExample.Criteria;
import com.manager.utils.StringUtil;

public class User extends BaseEntity{
    private String userName;

    private String password;

    private String userSingal;

    private Date userBirthday;

    private String userPhone;

    private String userStatus;

    private String userAddress;

    private String userRank;

    private String parentUserId;
    
    private String password2;
    
    private List<Customer> cus;

    public User(){
    	this.cus = new ArrayList<Customer>();
    }
    
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getUserSingal() {
        return userSingal;
    }

    public void setUserSingal(String userSingal) {
        this.userSingal = userSingal == null ? null : userSingal.trim();
    }

    public Date getUserBirthday() {
        return userBirthday;
    }

    public void setUserBirthday(Date userBirthday) {
        this.userBirthday = userBirthday;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    public String getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus == null ? null : userStatus.trim();
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress == null ? null : userAddress.trim();
    }

    public String getUserRank() {
        return userRank;
    }

    public void setUserRank(String userRank) {
        this.userRank = userRank == null ? null : userRank.trim();
    }

    public String getParentUserId() {
        return parentUserId;
    }

    public void setParentUserId(String parentUserId) {
        this.parentUserId = parentUserId == null ? null : parentUserId.trim();
    }

	public List<Customer> getCus() {
		return cus;
	}

	public void setCus(List<Customer> cus) {
		this.cus = cus == null ? new ArrayList<Customer>(): cus;
	}
    
	public void addCustomer(Customer customer){
		this.cus.add(customer);
	}

	public String getPassword2() {
		return password2;
	}

	public void setPassword2(String password2) {
		this.password2 = password2;
	}
	public UserExample getExample(){
		UserExample example = new UserExample();
		Criteria criteria = example.createCriteria();
		if(StringUtil.isNotNull(this.getUuid())){
			criteria.andUuidEqualTo(this.getUuid());
		}
		if(StringUtil.isNotNull(this.userName)){
			criteria.andUserNameEqualTo(this.userName);
		}
		if(StringUtil.isNotNull(this.userStatus)){
			criteria.andUserStatusEqualTo(this.userStatus);
		}
		if(StringUtil.isNotNull(this.userSingal)){
			criteria.andUserSingalEqualTo(this.userSingal);
		}
		if(StringUtil.isNotNull(this.userRank)){
			criteria.andUserRankEqualTo(this.userRank);
		}
		if(StringUtil.isNotNull(this.userPhone)){
			criteria.andUserPhoneEqualTo(this.userPhone);
		}
		if(StringUtil.isNotNull(this.userAddress)){
			criteria.andUserAddressEqualTo(this.userAddress);
		}
		if(StringUtil.isNotNull(this.parentUserId)){
			criteria.andParentUserIdEqualTo(this.parentUserId);
		}
		return example;
	}
	
}
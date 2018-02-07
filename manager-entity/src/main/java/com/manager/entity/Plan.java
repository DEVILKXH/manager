package com.manager.entity;

import java.util.Date;

import com.manager.base.entity.BaseEntity;
import com.manager.entity.PlanExample.Criteria;
import com.manager.utils.StringUtil;

public class Plan extends BaseEntity{

    private String title;

    private Date createTime;

    private String userId;

    private String type;

    private String content;
    
    private String userName;
    
    private String readFlag;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
    
    public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getReadFlag() {
		return readFlag;
	}

	public void setReadFlag(String readFlag) {
		this.readFlag = readFlag;
	}

	public PlanExample getExample(){
    	PlanExample example = new PlanExample();
    	Criteria criteria = example.createCriteria();
    	if(StringUtil.isNotNull(this.getUuid())){
    		criteria.andUuidEqualTo(this.getUuid());
    	}
    	if(StringUtil.isNotNull(this.content)){
    		criteria.andContentEqualTo(this.content);
    	}
    	if(StringUtil.isNotNull(this.title)){
    		criteria.andTitleEqualTo(this.title);
    	}
    	if(StringUtil.isNotNull(this.userId)){
    		criteria.andContentEqualTo(this.userId);
    	}
    	if(null != this.createTime){
    		criteria.andCreateTimeEqualTo(this.createTime);
    	}
    	if(StringUtil.isNotNull(this.type)){
    		criteria.andTypeEqualTo(this.type);
    	}
    	if(StringUtil.isNotNull(this.readFlag)){
    		criteria.andReadFlagEqualTo(this.readFlag);
    	}
    	return example;
    }
}
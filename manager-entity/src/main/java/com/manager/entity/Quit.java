package com.manager.entity;

import java.util.Date;

import com.manager.base.entity.BaseEntity;

public class Quit extends BaseEntity{

    private String userName;

    private String quitReason;

    private Date quitTime;

    private String quitIsSave;

    private String quitIsAgree;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getQuitReason() {
        return quitReason;
    }

    public void setQuitReason(String quitReason) {
        this.quitReason = quitReason == null ? null : quitReason.trim();
    }

    public Date getQuitTime() {
        return quitTime;
    }

    public void setQuitTime(Date quitTime) {
        this.quitTime = quitTime;
    }

    public String getQuitIsSave() {
        return quitIsSave;
    }

    public void setQuitIsSave(String quitIsSave) {
        this.quitIsSave = quitIsSave == null ? null : quitIsSave.trim();
    }

    public String getQuitIsAgree() {
        return quitIsAgree;
    }

    public void setQuitIsAgree(String quitIsAgree) {
        this.quitIsAgree = quitIsAgree == null ? null : quitIsAgree.trim();
    }
}
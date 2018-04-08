package com.manager.entity;

import java.util.Date;

import com.manager.base.entity.BaseEntity;

public class Expanse extends BaseEntity{
    private String userName;

    private String expanseReason;

    private Date expanseTime;

    private String expanseMoney;

    private String bankAccount;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getExpanseReason() {
        return expanseReason;
    }

    public void setExpanseReason(String expanseReason) {
        this.expanseReason = expanseReason == null ? null : expanseReason.trim();
    }

    public Date getExpanseTime() {
        return expanseTime;
    }

    public void setExpanseTime(Date expanseTime) {
        this.expanseTime = expanseTime;
    }

    public String getExpanseMoney() {
        return expanseMoney;
    }

    public void setExpanseMoney(String expanseMoney) {
        this.expanseMoney = expanseMoney == null ? null : expanseMoney.trim();
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount == null ? null : bankAccount.trim();
    }
}
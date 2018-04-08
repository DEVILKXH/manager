package com.manager.entity;

import com.manager.base.entity.BaseEntity;

public class Item extends BaseEntity{
    private String itemNo;

    private String itemName;

    private String itemCompany;

    private String itemType;

    private Long itemPrice;

    private Integer itemNum;

    public String getItemNo() {
        return itemNo;
    }

    public void setItemNo(String itemNo) {
        this.itemNo = itemNo == null ? null : itemNo.trim();
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName == null ? null : itemName.trim();
    }

    public String getItemCompany() {
        return itemCompany;
    }

    public void setItemCompany(String itemCompany) {
        this.itemCompany = itemCompany == null ? null : itemCompany.trim();
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType == null ? null : itemType.trim();
    }

    public Long getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(Long itemPrice) {
        this.itemPrice = itemPrice;
    }

    public Integer getItemNum() {
        return itemNum;
    }

    public void setItemNum(Integer itemNum) {
        this.itemNum = itemNum;
    }
}
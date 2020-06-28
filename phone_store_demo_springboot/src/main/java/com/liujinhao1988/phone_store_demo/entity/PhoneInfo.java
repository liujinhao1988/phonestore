package com.liujinhao1988.phone_store_demo.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


@Data
@Entity
public class PhoneInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer phoneId;
    private String phoneName;
    private BigDecimal phonePrice;
    private String phoneDescription;
    private Integer phoneStock;
    private String phoneIcon;
    private Integer categoryType;
    private String phoneTag;
    private Date createTime;
    private Date updateTime;


    public Integer getPhoneId() {
        return phoneId;
    }

    public void setPhoneId(Integer phoneId) {
        this.phoneId = phoneId;
    }

    public String getPhoneName() {
        return phoneName;
    }

    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }

    public BigDecimal getPhonePrice() {
        return phonePrice;
    }

    public void setPhonePrice(BigDecimal phonePrice) {
        this.phonePrice = phonePrice;
    }

    public String getPhoneDescription() {
        return phoneDescription;
    }

    public void setPhoneDescription(String phoneDescription) {
        this.phoneDescription = phoneDescription;
    }

    public Integer getPhoneStock() {
        return phoneStock;
    }

    public void setPhoneStock(Integer phoneStock) {
        this.phoneStock = phoneStock;
    }

    public String getPhoneIcon() {
        return phoneIcon;
    }

    public void setPhoneIcon(String phoneIcon) {
        this.phoneIcon = phoneIcon;
    }

    public Integer getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(Integer categoryType) {
        this.categoryType = categoryType;
    }

    public String getPhoneTag() {
        return phoneTag;
    }

    public void setPhoneTag(String phoneTag) {
        this.phoneTag = phoneTag;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}

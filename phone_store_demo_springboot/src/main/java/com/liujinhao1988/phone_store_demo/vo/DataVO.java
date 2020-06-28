package com.liujinhao1988.phone_store_demo.vo;

import lombok.Data;

import java.util.List;

@Data
public class DataVO {
    private List<PhoneCategoryVO> categories;
    private List<PhoneInfoVO> phones;

    public List<PhoneCategoryVO> getCategories() {
        return categories;
    }

    public void setCategories(List<PhoneCategoryVO> categories) {
        this.categories = categories;
    }

    public List<PhoneInfoVO> getPhones() {
        return phones;
    }

    public void setPhones(List<PhoneInfoVO> phones) {
        this.phones = phones;
    }
}

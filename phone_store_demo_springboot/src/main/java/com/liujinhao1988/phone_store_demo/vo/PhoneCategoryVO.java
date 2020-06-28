package com.liujinhao1988.phone_store_demo.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data

public class PhoneCategoryVO {
    @JsonProperty("name")
    private String categoryName;
    @JsonProperty("type")
    private Integer categoryType;



    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }



    public void setCategoryType(Integer categoryType) {
        this.categoryType = categoryType;
    }
}
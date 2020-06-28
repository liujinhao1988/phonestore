package com.liujinhao1988.phone_store_demo.exception;


import com.liujinhao1988.phone_store_demo.enums.ResultEnum;

public class PhoneException extends RuntimeException {
    public PhoneException(ResultEnum resultEnum) {
        super(resultEnum.getMsg());
    }

    public PhoneException(String error) {
        super(error);
    }
}
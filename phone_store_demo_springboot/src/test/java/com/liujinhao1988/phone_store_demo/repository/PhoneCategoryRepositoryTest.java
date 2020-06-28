package com.liujinhao1988.phone_store_demo.repository;

import com.liujinhao1988.phone_store_demo.entity.PhoneCategory;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class PhoneCategoryRepositoryTest {
    @Autowired
    private PhoneCategoryRepository repository;

    @Test
    void findAll(){
        List<PhoneCategory> list=repository.findAll();
        System.out.println(list);
    }
    @Test
    void findByCategoryType(){
        PhoneCategory phoneCategory=repository.findByCategoryType(1);
        System.out.println(phoneCategory);
    }

}
package com.liujinhao1988.phone_store_demo.repository;

import com.liujinhao1988.phone_store_demo.entity.PhoneCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhoneCategoryRepository extends JpaRepository<PhoneCategory,Integer> {
    public PhoneCategory findByCategoryType(Integer categorType);
}

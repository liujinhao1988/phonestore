package com.liujinhao1988.phone_store_demo.repository;

import com.liujinhao1988.phone_store_demo.entity.PhoneSpecs;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PhoneSpecsRepository extends JpaRepository<PhoneSpecs,Integer> {
    public List<PhoneSpecs> findAllByPhoneId(Integer phoneId);
}

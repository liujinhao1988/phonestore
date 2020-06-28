package com.liujinhao1988.phone_store_demo;

import com.liujinhao1988.phone_store_demo.service.PhoneService;
import com.liujinhao1988.phone_store_demo.vo.DataVO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PhoneStoreDemoApplicationTests {

    @Autowired
    private PhoneService phoneService;

    @Test
    void findDataVO() {
        DataVO dataVO = phoneService.findDataVO();
        int id = 0;
    }


}

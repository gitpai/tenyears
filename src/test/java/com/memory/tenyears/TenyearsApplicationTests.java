package com.memory.tenyears;

import com.memory.tenyears.models.user.account.SmsKyeInfo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TenyearsApplicationTests {
    @Autowired
    private SmsKyeInfo smsKyeInfo;

    @Test
    void contextLoads() {
        System.out.println(smsKyeInfo.getAccessKeyId());
    }

}

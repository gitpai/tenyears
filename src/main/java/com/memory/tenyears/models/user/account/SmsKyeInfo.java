package com.memory.tenyears.models.user.account;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Author: yujie
 * @Date: 2019/10/20 23:19
 * @Version 1.0
 */
@Component
@ConfigurationProperties(prefix = "sms-key-info")
public class SmsKyeInfo {
    private String accessKeyId;
    private String accessSecret;

    public String getAccessKeyId() {
        return accessKeyId;
    }

    public void setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
    }

    public String getAccessSecret() {
        return accessSecret;
    }

    public void setAccessSecret(String accessSecret) {
        this.accessSecret = accessSecret;
    }
}

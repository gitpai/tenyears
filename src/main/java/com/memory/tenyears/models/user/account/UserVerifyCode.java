package com.memory.tenyears.models.user.account;

import java.util.Date;

/**
 * @Author: yujie
 * @Date: 2019/10/20 22:31
 * @Version 1.0
 */
public class UserVerifyCode {
    private String userName;
    private String phoneNumber;
    private String verfyCode;
    private Date date;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getVerfyCode() {
        return verfyCode;
    }

    public void setVerfyCode(String verfyCode) {
        this.verfyCode = verfyCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

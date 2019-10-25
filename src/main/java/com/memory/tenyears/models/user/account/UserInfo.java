package com.memory.tenyears.models.user.account;

import javax.xml.crypto.Data;

/**
 * @Author: yujie
 * @Date: 2019/10/25 23:48
 * @Version 1.0
 */
public class UserInfo {
    private Integer id;
    private String phoneNumber;
    private String nickName;
    private String tenYearsId;
    private String email;
    private Boolean userSex;
    private String userPassword;
    private String userHeadPicture;
    private String userhomepagePicture;
    private String userTextSignature;
    private String userSoundSignature;
    private Data userRegisterTime;
    private Data userLastLogInTime;
    private Integer userType;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getTenYearsId() {
        return tenYearsId;
    }

    public void setTenYearsId(String tenYearsId) {
        this.tenYearsId = tenYearsId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getUserSex() {
        return userSex;
    }

    public void setUserSex(Boolean userSex) {
        this.userSex = userSex;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserHeadPicture() {
        return userHeadPicture;
    }

    public void setUserHeadPicture(String userHeadPicture) {
        this.userHeadPicture = userHeadPicture;
    }

    public String getUserhomepagePicture() {
        return userhomepagePicture;
    }

    public void setUserhomepagePicture(String userhomepagePicture) {
        this.userhomepagePicture = userhomepagePicture;
    }

    public String getUserTextSignature() {
        return userTextSignature;
    }

    public void setUserTextSignature(String userTextSignature) {
        this.userTextSignature = userTextSignature;
    }

    public String getUserSoundSignature() {
        return userSoundSignature;
    }

    public void setUserSoundSignature(String userSoundSignature) {
        this.userSoundSignature = userSoundSignature;
    }

    public Data getUserRegisterTime() {
        return userRegisterTime;
    }

    public void setUserRegisterTime(Data userRegisterTime) {
        this.userRegisterTime = userRegisterTime;
    }

    public Data getUserLastLogInTime() {
        return userLastLogInTime;
    }

    public void setUserLastLogInTime(Data userLastLogInTime) {
        this.userLastLogInTime = userLastLogInTime;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }
}

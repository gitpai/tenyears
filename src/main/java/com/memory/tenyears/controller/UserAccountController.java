package com.memory.tenyears.controller;

import com.memory.tenyears.models.NetResult;
import com.memory.tenyears.models.user.account.SmsKyeInfo;
import com.memory.tenyears.models.user.account.UserVerifyCode;
import com.memory.tenyears.utils.SMSUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.Random;

/**
 * @Author: yujie
 * @Date: 2019/10/20 22:13
 * @Version 1.0
 */
@Controller
public class UserAccountController {
    @Autowired
    private SmsKyeInfo smsKyeInfo;

    @ResponseBody
    @RequestMapping("/register/verifycode")
    public NetResult sendMessage(@RequestParam("phoneNumber") String phoneNumber) {
        NetResult netResult = new NetResult();
        UserVerifyCode userVerifyCode = new UserVerifyCode();
        //生成4位验证码
        String smsCode = SMSUtil.getVerifyCode();
        System.out.println("验证码为： " + smsCode);
        userVerifyCode.setUserName(phoneNumber);
        userVerifyCode.setVerfyCode(smsCode);
        userVerifyCode.setDate(new Date());
        SMSUtil.getInstance().sendPhoneMessage(phoneNumber, smsCode, smsKyeInfo.getAccessKeyId(), smsKyeInfo.getAccessSecret());
        netResult.setStatus(1);
        netResult.setContent("下发验证码成功");
        //netResult.setStatus(0);
        //netResult.setContent("下发验证码失败，该手机号已注册，请登录");
        return netResult;
    }
}

package com.memory.tenyears.utils;

import com.aliyuncs.CommonRequest;
import com.aliyuncs.CommonResponse;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.profile.DefaultProfile;
import com.memory.tenyears.models.user.account.SmsKyeInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;

/**
 * @Author: yujie
 * @Date: 2019/10/20 22:03
 * @Version 1.0
 */
public class SMSUtil {

    private static SMSUtil sInstance;

    private static final Object LOCK = new Object();

    public static SMSUtil getInstance() {
        if (sInstance == null) {
            synchronized (LOCK) {
                if (sInstance == null) {
                    sInstance = new SMSUtil();
                }
            }
        }
        return sInstance;
    }

    public void sendPhoneMessage(String phoneNumber, String smsCode, String accessKeyId, String accessSecret) {
        DefaultProfile profile = DefaultProfile.getProfile("cn-hangzhou", accessKeyId, accessSecret);
        IAcsClient client = new DefaultAcsClient(profile);

        CommonRequest request = new CommonRequest();
        request.setMethod(MethodType.POST);
        request.setDomain("dysmsapi.aliyuncs.com");
        request.setVersion("2017-05-25");
        request.setAction("SendSms");
        request.putQueryParameter("RegionId", "cn-hangzhou");
        request.putQueryParameter("PhoneNumbers", phoneNumber);
        request.putQueryParameter("SignName", "TenYears");
        request.putQueryParameter("TemplateCode", "SMS_175532955");
        request.putQueryParameter("TemplateParam", "{\"code\":\"" + smsCode + "\"}");
        try {
            CommonResponse response = client.getCommonResponse(request);
            System.out.println(response.getData());
        } catch (ServerException e) {
            System.out.println("SMSUtil: send sms failed as ServerException");
            e.printStackTrace();
        } catch (ClientException e) {
            System.out.println("SMSUtil: send sms failed as ClientException");
            e.printStackTrace();
        }

    }

    public static String getVerifyCode() {
        String smsCode = "";
        for (int i = 0; i < 4; i++) {
            smsCode += new Random().nextInt(10) + "";
        }
        return smsCode;
    }
}

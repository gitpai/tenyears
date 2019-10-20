package com.memory.tenyears.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: yujie
 * @Date: 2019/10/20 14:52
 * @Version 1.0
 */
@Controller
public class TenYearsStart {

    @ResponseBody
    @RequestMapping("/tenyears")
    public String tenYearsStart() {
        return "start tenyears";
    }
}

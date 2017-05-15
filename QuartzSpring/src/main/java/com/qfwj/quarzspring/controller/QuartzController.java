package com.qfwj.quarzspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by puhui on 2017/5/13.
 */
@Controller
@RequestMapping("/index")
public class QuartzController {
    @RequestMapping("/testQuartz")
    public  Object  index(){
        return  "test";
    }
}

package com.example.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by YanMing on 2017/2/24.
 */

@Controller
public class HomeController {
    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @RequestMapping("/index")
    public String index(){
        logger.info("the first jsp page");
        return "index";
    }

    @RequestMapping("/hello")
    public String hello(){
        logger.info("the first jsp page");
        return "home";
    }
}

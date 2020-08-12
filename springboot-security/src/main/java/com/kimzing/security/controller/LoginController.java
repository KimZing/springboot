package com.kimzing.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * .
 *
 * @author KimZing - kimzing@163.com
 * @since 2020/8/12 23:41
 */
@Controller
public class LoginController {

    @RequestMapping("/login")
    public String login() {
        return "login.html";
    }

}

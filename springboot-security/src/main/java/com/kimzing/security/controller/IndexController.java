package com.kimzing.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 首页.
 *
 * @author KimZing - kimzing@163.com
 * @since 2020/8/8 21:24
 */
@RestController
public class IndexController {

    @GetMapping("/")
    public String index() {
        return "Welcome to Security!";
    }

}

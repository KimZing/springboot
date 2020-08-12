package com.kimzing.security.controller;

import com.kimzing.security.domain.UserBO;
import com.kimzing.security.domain.UserSaveDTO;
import com.kimzing.security.domain.UserUpdateDTO;
import org.springframework.web.bind.annotation.*;

/**
 * .
 *
 * @author KimZing - kimzing@163.com
 * @since 2020/8/12 21:08
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @PostMapping
    public Integer save(UserSaveDTO userSaveDTO) {
        return 1;
    }

    @DeleteMapping("/{id}")
    public Integer delete(@PathVariable Integer id) {
        return 1;
    }

    @PutMapping
    public Integer update(UserUpdateDTO userUpdateDTO) {
        return 1;
    }

    @GetMapping("/{id}")
    public UserBO get(@PathVariable Integer id) {
        return new UserBO();
    }

}

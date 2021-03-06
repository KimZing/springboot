package com.kimzing.mybatis.controller;

import com.kimzing.mybatis.domain.dto.UserDTO;
import com.kimzing.mybatis.service.UserService;
import com.kimzing.utils.result.ApiResult;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 模拟用户控制层.
 *
 * @author KimZing - kimzing@163.com
 * @since 2019/12/28 11:37
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Resource
    UserService userService;

    @PostMapping
    public ApiResult save(@RequestBody UserDTO userDTO) {
        return userService.save(userDTO);
    }

    @DeleteMapping("/{id}")
    public ApiResult remove(@PathVariable Long id) {
        return userService.remove(id);
    }

    @PutMapping("/{id}")
    public ApiResult update(@RequestBody UserDTO userDTO, @PathVariable Long id) {
        userDTO.setId(id);
        return userService.update(userDTO);
    }

    @GetMapping("/{id}")
    public ApiResult find(@PathVariable Long id) {
        return userService.find(id);
    }

    @GetMapping("/list")
    public ApiResult list() {
        return userService.list();
    }

}

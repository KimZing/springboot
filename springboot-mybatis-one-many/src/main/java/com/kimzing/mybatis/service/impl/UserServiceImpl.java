package com.kimzing.mybatis.service.impl;

import com.kimzing.utils.bean.BeanUtil;
import com.kimzing.utils.result.ApiResult;
import com.kimzing.mybatis.domain.dto.UserDTO;
import com.kimzing.mybatis.domain.po.UserPO;
import com.kimzing.mybatis.repository.UserRepository;
import com.kimzing.mybatis.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 用户模拟服务实现.
 *
 * @author KimZing - kimzing@163.com
 * @since 2019/12/28 16:33
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    UserRepository userRepository;

    @Override
    public ApiResult save(UserDTO userDTO) {
        UserPO userPO = BeanUtil.mapperBean(userDTO, UserPO.class);
        userRepository.save(userPO);
        return ApiResult.success();
    }

    @Override
    public ApiResult remove(Long id) {
        userRepository.remove(id);
        return ApiResult.success();
    }

    @Override
    public ApiResult update(UserDTO userDTO) {
        UserPO userPO = BeanUtil.mapperBean(userDTO, UserPO.class);
        userRepository.update(userPO);
        return ApiResult.success();
    }

    @Override
    public ApiResult find(Long id) {
        UserPO userPO = userRepository.find(id);
        UserDTO userDTO = BeanUtil.mapperBean(userPO, UserDTO.class);
        return ApiResult.success(userDTO);
    }

    @Override
    public ApiResult list() {
        List<UserPO> userPOList = userRepository.list();
        List<UserDTO> userDTOList = BeanUtil.mapperList(userPOList, UserDTO.class);
        return ApiResult.success(userDTOList);
    }
}

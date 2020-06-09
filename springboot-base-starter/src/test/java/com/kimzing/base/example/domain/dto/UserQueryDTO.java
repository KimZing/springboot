package com.kimzing.base.example.domain.dto;

import com.kimzing.base.example.domain.vo.GenderEnum;
import lombok.Data;

/**
 * 查询用户条件.
 *
 * @author KimZing - kimzing@163.com
 * @since 2020/1/7 11:15
 */
@Data
public class UserQueryDTO {

    private Integer ageFrom;

    private Integer ageTo;

    private GenderEnum gender;

}

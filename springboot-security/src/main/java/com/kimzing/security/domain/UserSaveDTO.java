package com.kimzing.security.domain;

import lombok.Data;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

/**
 * 用户体.
 *
 * @author KimZing - kimzing@163.com
 * @since 2020/8/12 21:09
 */
@Data
@Accessors(chain = true)
public class UserSaveDTO {

    private String username;

    private Integer age;

    private LocalDateTime birth;

}

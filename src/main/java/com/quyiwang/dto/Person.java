package com.quyiwang.dto;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * @Description
 * @Author huangweiyue
 * @Date Created in 2018-06-19 17:08
 * @ModifiedBy
 * @Version v1.0
 */
@Data
@ToString
public class Person implements Serializable{
    private String name;
    private Integer age;
}

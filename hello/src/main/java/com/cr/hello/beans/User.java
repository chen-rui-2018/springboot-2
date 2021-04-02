package com.cr.hello.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author： chenr
 * @date： Created on 2021/4/2 11:10
 * @version： v1.0
 * @modified By:
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Integer id;
    private String name;
    private Integer age;
    private Pet pet;
}


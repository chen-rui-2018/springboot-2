package com.cr.hello.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author： chenr
 * @date： Created on 2021/4/2 11:14
 * @version： v1.0
 * @modified By:
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Pet {
    private Integer id;
    private String name;
}

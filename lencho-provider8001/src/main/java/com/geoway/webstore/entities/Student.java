package com.geoway.webstore.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author Lencho
 * @create 2021-08-18 21:50
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private Integer id;

    private String name;

    private Integer age;

    private Integer no;
}

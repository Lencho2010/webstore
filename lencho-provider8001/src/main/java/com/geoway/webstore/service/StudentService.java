package com.geoway.webstore.service;

import com.geoway.webstore.entities.Student;

import java.util.List;
import java.util.Map;

/**
 * @author Lencho
 * @create 2021-08-18 21:53
 */
public interface StudentService {

    public List<Map> queryAll();

    public List<Student> selectForPage1(int startIndex, int pageSize);

    public List<Student> selectForPage2(Map<String, Object> map);

    public Integer selectCount();

    public List<Student> selectForPage4(int startIndex,int pageSize,String keywords);
}

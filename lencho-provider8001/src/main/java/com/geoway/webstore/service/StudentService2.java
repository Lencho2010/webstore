package com.geoway.webstore.service;

import com.geoway.webstore.dao.StudentMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author Lencho
 * @create 2021-08-18 21:56
 */
//@Service
public class StudentService2 {
    @Autowired
    @Qualifier("masterSqlSessionFactory")
    SqlSessionFactory factory;

    public List<Map> queryStudents() {

        SqlSession sqlSession = factory.openSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        return mapper.queryAll();
    }

    @Autowired
    @Qualifier("secondSqlSessionFactory")
    SqlSessionFactory secondFactory;

    public List<Map> queryStudents2() {

        SqlSession sqlSession = secondFactory.openSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        return mapper.queryAll();
    }
}

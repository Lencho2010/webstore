package com.geoway.webstore.controller;

import com.geoway.webstore.anno.ResponseResult;
import com.geoway.webstore.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author Lencho
 * @create 2021-08-18 21:55
 */
@RestController
@RequestMapping("/student")
@ResponseResult
public class StudentController {
    @Resource
    private StudentService studentService;

    @GetMapping("/queryAll")
    public List<Map> queryAll(){
        return studentService.queryAll();
    }

   /* @Resource
    private StudentService2 testService;

    @GetMapping("/queryStudents")
    public List<Map> queryStudents(){
        return testService.queryStudents();
    }

    @GetMapping("/queryStudents2")
    public List<Map> queryStudents2(){
        return testService.queryStudents2();
    }*/
}

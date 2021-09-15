package com.geoway.webstore.controller;

import com.geoway.webstore.anno.ResponseResult;
import com.geoway.webstore.entities.JctbTaskSub;
import com.geoway.webstore.service.JctbTaskSubService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: Lencho
 * @CreateTime: 2021/9/15 17:46
 * @Description:
 */
@RestController
@RequestMapping("/jctbTaskSub")
@ResponseResult
public class JctbTaskSubController {

    @Resource
    JctbTaskSubService jctbTaskSubService;

    @DeleteMapping("/{taskName}")
    public int deleteByTaskName(@PathVariable("taskName") String taskName) {
        return jctbTaskSubService.deleteByTaskName(taskName);
    }

    @PostMapping
    public int insert(@RequestBody JctbTaskSub record) {
        return jctbTaskSubService.insert(record);
    }

    @PostMapping("/batch")
    public int batchInsert(@RequestBody List<JctbTaskSub> records) {
        return jctbTaskSubService.batchInsert(records);
    }

    @GetMapping("/{taskName}")
    public List<JctbTaskSub> listByTaskName(@PathVariable("taskName") String taskName) {
        return jctbTaskSubService.listByTaskName(taskName);
    }

    @PutMapping
    public int updateByPrimaryKey(@RequestBody JctbTaskSub record) {
        return jctbTaskSubService.updateByPrimaryKey(record);
    }
}
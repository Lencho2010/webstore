package com.geoway.webstore.controller;

import com.geoway.webstore.anno.ResponseResult;
import com.geoway.webstore.entities.ZipSubTaskInfo;
import com.geoway.webstore.service.ZipSubTaskInfoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Lencho
 * @create 2021-09-09 16:06
 * @desc
 */
@RestController
@RequestMapping("/subTaskInfo")
@ResponseResult
public class ZipSubTaskInfoController {

    @Resource
    ZipSubTaskInfoService zipSubTaskInfoService;

    @GetMapping("/list/{taskName}")
    public List<ZipSubTaskInfo> listByCode(@PathVariable("taskName") String taskName) {
        return zipSubTaskInfoService.listByCode(taskName);
    }
}

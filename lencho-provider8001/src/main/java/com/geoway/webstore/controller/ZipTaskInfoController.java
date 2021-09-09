package com.geoway.webstore.controller;

import com.geoway.webstore.anno.ResponseResult;
import com.geoway.webstore.dto.ZipTaskInfoDto;
import com.geoway.webstore.entities.ZipSubTaskInfo;
import com.geoway.webstore.entities.ZipTaskInfo;
import com.geoway.webstore.service.ZipTaskInfoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Lencho
 * @create 2021-09-09 16:05
 * @desc
 */
@RestController
@RequestMapping("/taskInfo")
@ResponseResult
public class ZipTaskInfoController {

    @Resource
    private ZipTaskInfoService zipTaskInfoService;

    @GetMapping("/list/{taskName}")
    public List<ZipTaskInfo> listByCode(@PathVariable("taskName") String taskName) {
        return zipTaskInfoService.listByCode(taskName);
    }

    @GetMapping("/list2/{taskName}")
    public List<ZipTaskInfoDto> listByCode2(@PathVariable("taskName") String taskName){
        return zipTaskInfoService.listByCode2(taskName);
    }
}

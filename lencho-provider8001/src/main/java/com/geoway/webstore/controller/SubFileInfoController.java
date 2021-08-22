package com.geoway.webstore.controller;

import com.geoway.webstore.anno.ResponseResult;
import com.geoway.webstore.entities.SubFileInfo;
import com.geoway.webstore.service.SubFileInfoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Lencho
 * @create 2021-08-22 15:09
 */
@RestController
@RequestMapping("/subFileInfo")
@ResponseResult
public class SubFileInfoController {

    @Resource
    private SubFileInfoService subFileInfoService;

    @GetMapping("/count")
    public Integer selectCount() {
        return subFileInfoService.selectCount();
    }

    @GetMapping("/list/{startIndex}/{pageSize}")
    public List<SubFileInfo> selectForPage(@PathVariable("startIndex") int startIndex, @PathVariable("pageSize") int pageSize) {
        return subFileInfoService.selectForPage(startIndex, pageSize);
    }

    @GetMapping("/select/{taskId}")
    public List<SubFileInfo> selectByTaskId(@PathVariable("taskId") int taskId) {
        return subFileInfoService.selectByTaskId(taskId);
    }
}

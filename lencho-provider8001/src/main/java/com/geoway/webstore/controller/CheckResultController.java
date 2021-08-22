package com.geoway.webstore.controller;

import com.geoway.webstore.anno.ResponseResult;
import com.geoway.webstore.entities.CheckResult;
import com.geoway.webstore.service.CheckResultService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Lencho
 * @create 2021-08-22 14:45
 */
@RestController
@RequestMapping("/checkResult")
@ResponseResult
public class CheckResultController {

    @Resource
    private CheckResultService checkResultService;

    @GetMapping("/count")
    public Integer selectCount() {
        return checkResultService.selectCount();
    }

    @GetMapping("/list/{startIndex}/{pageSize}")
    public List<CheckResult> selectForPage(@PathVariable("startIndex") int startIndex, @PathVariable("pageSize") int pageSize) {
        return checkResultService.selectForPage(startIndex, pageSize);
    }

    @GetMapping("/select/{code}")
    public List<CheckResult> selectByCode(@PathVariable("code") String code) {
        return checkResultService.selectByCode(code);
    }
}

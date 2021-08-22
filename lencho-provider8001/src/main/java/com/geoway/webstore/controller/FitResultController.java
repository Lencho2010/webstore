package com.geoway.webstore.controller;

import com.geoway.webstore.anno.ResponseResult;
import com.geoway.webstore.entities.FitResult;
import com.geoway.webstore.service.FitResultService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Lencho
 * @create 2021-08-22 14:58
 */
@RestController
@RequestMapping("/fitResult")
@ResponseResult
public class FitResultController {

    @Resource
    private FitResultService fitResultService;

    @GetMapping("/count")
    public Integer selectCount() {
        return fitResultService.selectCount();
    }

    @GetMapping("/list/{startIndex}/{pageSize}")
    public List<FitResult> selectForPage(@PathVariable("startIndex") int startIndex, @PathVariable("pageSize") int pageSize) {
        return fitResultService.selectForPage(startIndex, pageSize);
    }

    @GetMapping("select/{code}")
    public List<FitResult> selectByCode(@PathVariable("code") String code) {
        return fitResultService.selectByCode(code);
    }
}

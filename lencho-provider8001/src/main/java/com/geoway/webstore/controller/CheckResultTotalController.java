package com.geoway.webstore.controller;

import com.geoway.webstore.anno.ResponseResult;
import com.geoway.webstore.entities.CheckResultTotal;
import com.geoway.webstore.service.CheckResultTotalService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Lencho
 * @create 2021-08-21 17:38
 */
@RestController
@RequestMapping("/checkResultTotal")
@ResponseResult
public class CheckResultTotalController {

    @Resource
    CheckResultTotalService checkResultTotalService;

    @GetMapping("/list/{startIndex}/{pageSize}")
    public List<CheckResultTotal> selectForPage(@PathVariable("startIndex") int startIndex, @PathVariable("pageSize") int pageSize) {
        return checkResultTotalService.selectForPage(startIndex, pageSize);
    }

    @GetMapping("/count")
    public int selectCount() {
        return checkResultTotalService.selectCount();
    }
}

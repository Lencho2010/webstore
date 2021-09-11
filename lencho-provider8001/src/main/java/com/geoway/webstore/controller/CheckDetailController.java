package com.geoway.webstore.controller;

import com.geoway.webstore.anno.ResponseResult;
import com.geoway.webstore.dto.CheckDetailDto;
import com.geoway.webstore.entities.CheckDetail;
import com.geoway.webstore.service.CheckDetailService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Lencho
 * @create 2021-08-22 14:50
 */
@RestController
@RequestMapping("/checkDetail")
@ResponseResult
public class CheckDetailController {

    @Resource
    private CheckDetailService checkDetailService;

    @GetMapping("/count")
    public Integer selectCount() {
        return checkDetailService.selectCount();
    }

    @GetMapping("/list/{startIndex}/{pageSize}")
    public List<CheckDetail> selectForPage(@PathVariable("startIndex") int startIndex, @PathVariable("pageSize") int pageSize) {
        return checkDetailService.selectForPage(startIndex, pageSize);
    }

    @GetMapping("select/{code}")
    public List<CheckDetail> selectByCode(@PathVariable("code") String code) {
        return checkDetailService.selectByCode(code);
    }

    @GetMapping("listByCode/{code}")
    public List<CheckDetailDto> listByCode(@PathVariable("code") String taskName) {
        return checkDetailService.listByCode(taskName);
    }
}

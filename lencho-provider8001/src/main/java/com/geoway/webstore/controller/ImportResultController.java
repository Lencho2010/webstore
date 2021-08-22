package com.geoway.webstore.controller;

import com.geoway.webstore.anno.ResponseResult;
import com.geoway.webstore.entities.ImportResult;
import com.geoway.webstore.service.ImportResultService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Lencho
 * @create 2021-08-22 15:02
 */
@RestController
@RequestMapping("/importResult")
@ResponseResult
public class ImportResultController {

    @Resource
    private ImportResultService importResultService;

    @GetMapping("/count")
    public Integer selectCount() {
        return importResultService.selectCount();
    }

    @GetMapping("/list/{startIndex}/{pageSize}")
    public List<ImportResult> selectForPage(@PathVariable("startIndex") int startIndex, @PathVariable("pageSize") int pageSize) {
        return importResultService.selectForPage(startIndex, pageSize);
    }

    @GetMapping("/select/{code}")
    public List<ImportResult> selectByCode(@PathVariable("code") String code) {
        return importResultService.selectByCode(code);
    }
}

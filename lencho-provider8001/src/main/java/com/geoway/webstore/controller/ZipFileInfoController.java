package com.geoway.webstore.controller;

import com.geoway.webstore.anno.ResponseResult;
import com.geoway.webstore.entities.ZipFileInfo;
import com.geoway.webstore.service.ZipFileInfoService;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Lencho
 * @create 2021-08-22 15:08
 */
@RestController
@RequestMapping("/zipFileInfo")
@ResponseResult
public class ZipFileInfoController {

    @Resource
    private ZipFileInfoService zipFileInfoService;

    @GetMapping("/count")
    public Integer selectCount() {
        return zipFileInfoService.selectCount();
    }

    @GetMapping("/list/{startIndex}/{pageSize}")
    public List<ZipFileInfo> selectForPage(@PathVariable("startIndex") int startIndex, @PathVariable("pageSize") int pageSize) {
        return zipFileInfoService.selectForPage(startIndex, pageSize);
    }

    @GetMapping("/select/{fileName}")
    public ZipFileInfo selectByName(@PathVariable("fileName") String fileName) {
        return zipFileInfoService.selectByName(fileName);
    }

    @GetMapping("/listPage/{page}/{rows}")
    public PageInfo select(@PathVariable("page") int page, @PathVariable("rows") int rows) {
        return zipFileInfoService.select(page, rows);
    }
}

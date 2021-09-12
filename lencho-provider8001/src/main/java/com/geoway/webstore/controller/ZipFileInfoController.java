package com.geoway.webstore.controller;

import com.geoway.webstore.anno.ResponseResult;
import com.geoway.webstore.dto.ZipFileInfoDto;
import com.geoway.webstore.entities.ZipFileInfo;
import com.geoway.webstore.service.ZipFileInfoService;
import com.geoway.webstore.service.impl.ZipFileInfoServiceImpl;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

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

    private static final Logger log = LoggerFactory.getLogger(ZipFileInfoController.class);


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

    /*@GetMapping("/select/{fileName}")
    public ZipFileInfo selectByName(@PathVariable("fileName") String fileName) {
        return zipFileInfoService.selectByName(fileName);
    }*/

    @GetMapping("/select/{fileName}")
    public ZipFileInfoDto selectByName(@PathVariable("fileName") String fileName) {
        return zipFileInfoService.selectByName(fileName);
    }

    @DeleteMapping(value = {"/delete/{id}"})
    public boolean deleteById(@PathVariable("id") Integer id) {
        return zipFileInfoService.deleteById(id);
    }

    @GetMapping(value = {"/listByStatus/{page}/{rows}"})
    public PageInfo listByStatus(@PathVariable("page") int page,
                                 @PathVariable("rows") int rows,
                                 @RequestParam(value = "taskName", required = false) String taskName,
                                 @RequestParam(value = "status", required = false) List<Integer> status) {
        log.info("listByStatus ### page:" + page + ";rows:" + rows);
        return zipFileInfoService.listByStatus(page, rows, taskName, status);
    }

    @PutMapping("/updateStatus")
    public boolean updateStatus(@RequestBody ZipFileInfoDto zipFileInfo) {
        return zipFileInfoService.updateStatus(zipFileInfo);
    }
}

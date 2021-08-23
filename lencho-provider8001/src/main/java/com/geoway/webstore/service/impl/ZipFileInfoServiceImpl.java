package com.geoway.webstore.service.impl;

import com.geoway.webstore.dao.ZipFileInfoDao;
import com.geoway.webstore.entities.ZipFileInfo;
import com.geoway.webstore.service.ZipFileInfoService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Lencho
 * @create 2021-08-22 15:08
 */
@Service
public class ZipFileInfoServiceImpl implements ZipFileInfoService {

    @Resource
    private ZipFileInfoDao zipFileInfoDao;

    @Override
    public Integer selectCount() {
        return zipFileInfoDao.selectCount();
    }

    @Override
    public PageInfo select(int page, int rows) {
        PageHelper.startPage(page, rows);
        List<ZipFileInfo> list = zipFileInfoDao.select();
        return new PageInfo<>(list);
    }

    @Override
    public List<ZipFileInfo> selectForPage(int startIndex, int pageSize) {
        return zipFileInfoDao.selectForPage(startIndex, pageSize);
    }

    @Override
    public ZipFileInfo selectByName(String fileName) {
        return zipFileInfoDao.selectByName(fileName);
    }
}
package com.geoway.webstore.service.impl;

import com.geoway.webstore.dao.SubFileInfoDao;
import com.geoway.webstore.entities.SubFileInfo;
import com.geoway.webstore.service.SubFileInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Lencho
 * @create 2021-08-22 15:08
 */
@Service
public class SubFileInfoServiceImpl implements SubFileInfoService {

    @Resource
    private SubFileInfoDao subFileInfoDao;

    @Override
    public Integer selectCount() {
        return subFileInfoDao.selectCount();
    }

    @Override
    public List<SubFileInfo> selectForPage(int startIndex, int pageSize) {
        return subFileInfoDao.selectForPage(startIndex, pageSize);
    }

    @Override
    public List<SubFileInfo> selectByTaskId(int taskId) {
        return subFileInfoDao.selectByTaskId(taskId);
    }
}

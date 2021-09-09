package com.geoway.webstore.service.impl;

import com.geoway.webstore.dao.ZipSubTaskInfoDao;
import com.geoway.webstore.entities.ZipSubTaskInfo;
import com.geoway.webstore.service.ZipSubTaskInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Lencho
 * @create 2021-09-09 16:05
 * @desc
 */
@Service
public class ZipSubTaskInfoServiceImpl implements ZipSubTaskInfoService {

    @Resource
    private ZipSubTaskInfoDao zipSubTaskInfoDao;

    @Override
    public List<ZipSubTaskInfo> listByCode(String taskName) {
        return zipSubTaskInfoDao.listByCode(taskName);
    }
}

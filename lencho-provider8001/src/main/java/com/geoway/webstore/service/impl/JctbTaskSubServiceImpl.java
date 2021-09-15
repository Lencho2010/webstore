package com.geoway.webstore.service.impl;

import com.geoway.webstore.dao.JctbTaskSubMapper;
import com.geoway.webstore.entities.JctbTaskSub;
import com.geoway.webstore.service.JctbTaskSubService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: Lencho
 * @CreateTime: 2021/9/15 17:42
 * @Description:
 */
@Service
public class JctbTaskSubServiceImpl implements JctbTaskSubService {
    @Resource
    JctbTaskSubMapper jctbTaskSubMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return jctbTaskSubMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int deleteByTaskName(String taskName) {
        return jctbTaskSubMapper.deleteByTaskName(taskName);
    }

    @Override
    public int insert(JctbTaskSub record) {
        return jctbTaskSubMapper.insert(record);
    }

    @Override
    public int batchInsert(List<JctbTaskSub> record) {
        return jctbTaskSubMapper.batchInsert(record);
    }

    @Override
    public int insertSelective(JctbTaskSub record) {
        return jctbTaskSubMapper.insertSelective(record);
    }

    @Override
    public JctbTaskSub selectByPrimaryKey(Long id) {
        return jctbTaskSubMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<JctbTaskSub> listByTaskName(String taskName) {
        return jctbTaskSubMapper.listByTaskName(taskName);
    }

    @Override
    public int updateByPrimaryKeySelective(JctbTaskSub record) {
        return jctbTaskSubMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(JctbTaskSub record) {
        return jctbTaskSubMapper.updateByPrimaryKey(record);
    }
}

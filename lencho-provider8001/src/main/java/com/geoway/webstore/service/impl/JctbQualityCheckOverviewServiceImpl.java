package com.geoway.webstore.service.impl;

import com.geoway.webstore.converter.JctbQualityCheckOverviewConverter;
import com.geoway.webstore.converter.JctbUnzipDetailConverter;
import com.geoway.webstore.dao.JctbQualityCheckOverviewMapper;
import com.geoway.webstore.dto.JctbQualityCheckOverviewDto;
import com.geoway.webstore.dto.JctbUnzipDetailDto;
import com.geoway.webstore.entities.JctbQualityCheckOverview;
import com.geoway.webstore.entities.JctbUnzipDetail;
import com.geoway.webstore.service.JctbQualityCheckOverviewService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.IntStream;

/**
 * @Author: Lencho
 * @CreateTime: 2021/9/16 10:33
 * @Description:
 */
@Service
public class JctbQualityCheckOverviewServiceImpl implements JctbQualityCheckOverviewService {

    @Resource
    JctbQualityCheckOverviewMapper jctbQualityCheckOverviewMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return jctbQualityCheckOverviewMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(JctbQualityCheckOverview record) {
        return jctbQualityCheckOverviewMapper.insert(record);
    }

    @Override
    public int insertSelective(JctbQualityCheckOverview record) {
        return jctbQualityCheckOverviewMapper.insertSelective(record);
    }

    @Override
    public JctbQualityCheckOverview selectByPrimaryKey(Long id) {
        return jctbQualityCheckOverviewMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(JctbQualityCheckOverview record) {
        return jctbQualityCheckOverviewMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(JctbQualityCheckOverview record) {
        return jctbQualityCheckOverviewMapper.updateByPrimaryKey(record);
    }

    @Override
    public int batchInsert(List<JctbQualityCheckOverview> records) {
        return jctbQualityCheckOverviewMapper.batchInsert(records);
    }

    @Override
    public int deleteByTaskName(String taskName) {
        return jctbQualityCheckOverviewMapper.deleteByTaskName(taskName);
    }

    @Override
    public List<JctbQualityCheckOverview> listByTaskName(String taskName) {
        return jctbQualityCheckOverviewMapper.listByTaskName(taskName);
    }

    @Override
    public List<JctbQualityCheckOverviewDto> listByTaskName2(String taskName) {
        List<JctbQualityCheckOverview> overviews = jctbQualityCheckOverviewMapper.listByTaskName(taskName);
        List<JctbQualityCheckOverviewDto> dtoList = JctbQualityCheckOverviewConverter.Instance.domain2dto(overviews);
        IntStream.range(0, dtoList.size()).forEach(i -> dtoList.get(i).setIndex(i + 1));
        return dtoList;
    }
}

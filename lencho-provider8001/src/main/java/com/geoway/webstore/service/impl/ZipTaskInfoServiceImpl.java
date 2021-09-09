package com.geoway.webstore.service.impl;

import com.geoway.webstore.converter.ZipTaskInfoConverter;
import com.geoway.webstore.dao.ZipTaskInfoDao;
import com.geoway.webstore.dto.ZipTaskInfoDto;
import com.geoway.webstore.entities.ZipSubTaskInfo;
import com.geoway.webstore.entities.ZipTaskInfo;
import com.geoway.webstore.service.ZipSubTaskInfoService;
import com.geoway.webstore.service.ZipTaskInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Lencho
 * @create 2021-09-09 16:04
 * @desc
 */
@Service
public class ZipTaskInfoServiceImpl implements ZipTaskInfoService {

    @Resource
    ZipTaskInfoDao zipTaskInfoDao;

    @Resource
    ZipSubTaskInfoService zipSubTaskInfoService;

    @Override
    public List<ZipTaskInfo> listByCode(String taskName) {
        return zipTaskInfoDao.listByCode(taskName);
    }

    @Override
    public List<ZipTaskInfoDto> listByCode2(String taskName) {
        List<ZipTaskInfo> zipTaskInfos = listByCode(taskName);
        List<ZipSubTaskInfo> zipSubTaskInfos = zipSubTaskInfoService.listByCode(taskName);

        List<ZipTaskInfoDto> taskInfoDtos = zipTaskInfos.stream().map(
              info->{
                  ZipTaskInfoDto zipTaskInfoDto = ZipTaskInfoConverter.Instance.domain2dto(info);
                  List<ZipSubTaskInfo> children = zipSubTaskInfos.stream().filter(sub -> sub.getParentKey().equals(info.getKey())).collect(Collectors.toList());
                  zipTaskInfoDto.setChildren(children);
                  return zipTaskInfoDto;
              }
        ).collect(Collectors.toList());

       return taskInfoDtos;
    }
}

package com.geoway.webstore.service;

import com.geoway.webstore.dto.ZipTaskInfoDto;
import com.geoway.webstore.entities.ZipTaskInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Lencho
 * @create 2021-09-09 16:04
 * @desc
 */
public interface ZipTaskInfoService {
    List<ZipTaskInfo> listByCode(String taskName);

    List<ZipTaskInfoDto> listByCode2(String taskName);
}

package com.geoway.webstore.service;

import com.geoway.webstore.dto.SubFileInfoDto;
import com.geoway.webstore.entities.SubFileInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Lencho
 * @create 2021-08-22 15:07
 */
public interface SubFileInfoService {

    public Integer selectCount();

    public List<SubFileInfo> selectForPage(@Param("startIndex") int startIndex, @Param("pageSize") int pageSize);

    public List<SubFileInfo> selectByTaskId(@Param("taskId") int taskId);

    List<SubFileInfoDto> listByTaskName(String taskName);
}

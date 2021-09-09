package com.geoway.webstore.dao;

import com.geoway.webstore.entities.ZipSubTaskInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Lencho
 * @create 2021-09-09 15:54
 * @desc
 */
@Mapper
public interface ZipSubTaskInfoDao {

    List<ZipSubTaskInfo> listByCode(@Param("taskName") String taskName);
}

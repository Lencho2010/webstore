package com.geoway.webstore.dao;

import com.geoway.webstore.entities.ZipFileInfo;
import com.geoway.webstore.entities.ZipTaskInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Lencho
 * @create 2021-09-09 15:54
 * @desc
 */
@Mapper
public interface ZipTaskInfoDao {

    List<ZipTaskInfo> listByCode(@Param("taskName") String taskName);

}

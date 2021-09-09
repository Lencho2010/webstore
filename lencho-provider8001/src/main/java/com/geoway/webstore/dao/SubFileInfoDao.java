package com.geoway.webstore.dao;

import com.geoway.webstore.entities.SubFileInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Lencho
 * @create 2021-08-22 15:06
 */
@Mapper
public interface SubFileInfoDao {

    public Integer selectCount();

    public List<SubFileInfo> selectForPage(@Param("startIndex") int startIndex, @Param("pageSize") int pageSize);

    public List<SubFileInfo> selectByTaskId(@Param("taskId") int taskId);

    List<SubFileInfo> listByTaskName(@Param("taskName") String taskName);
}

package com.geoway.webstore.dao;

import com.geoway.webstore.entities.ZipFileInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Lencho
 * @create 2021-08-22 15:07
 */
@Mapper
public interface ZipFileInfoDao {

    public Integer selectCount();

    public List<ZipFileInfo> listByStatus(@Param("taskName") String taskName, @Param("status") List<Integer> status);

    public List<ZipFileInfo> selectForPage(@Param("startIndex") int startIndex, @Param("pageSize") int pageSize);

    public ZipFileInfo selectByName(@Param("fileName") String fileName);

    public boolean deleteById(@Param("id") Integer id);
}

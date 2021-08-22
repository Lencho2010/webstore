package com.geoway.webstore.service;

import com.geoway.webstore.entities.ZipFileInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Lencho
 * @create 2021-08-22 15:07
 */
public interface ZipFileInfoService {
    public Integer selectCount();

    public List<ZipFileInfo> selectForPage(@Param("startIndex") int startIndex, @Param("pageSize") int pageSize);

    public ZipFileInfo selectByName(@Param("fileName") String fileName);
}

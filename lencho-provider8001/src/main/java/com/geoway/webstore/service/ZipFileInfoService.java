package com.geoway.webstore.service;

import com.geoway.webstore.entities.ZipFileInfo;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Lencho
 * @create 2021-08-22 15:07
 */
public interface ZipFileInfoService {
    public Integer selectCount();

    public PageInfo listByStatus(int page, int rows, String taskName, List<Integer> status);

    public List<ZipFileInfo> selectForPage(@Param("startIndex") int startIndex, @Param("pageSize") int pageSize);

    public ZipFileInfo selectByName(@Param("fileName") String fileName);

    public boolean deleteById(Integer id);
}

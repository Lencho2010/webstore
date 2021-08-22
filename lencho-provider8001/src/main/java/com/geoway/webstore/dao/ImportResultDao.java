package com.geoway.webstore.dao;

import com.geoway.webstore.entities.ImportResult;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Lencho
 * @create 2021-08-22 15:01
 */
@Mapper
public interface ImportResultDao {

    public Integer selectCount();

    public List<ImportResult> selectForPage(@Param("startIndex") int startIndex, @Param("pageSize") int pageSize);

    public List<ImportResult> selectByCode(@Param("code") String code);
}

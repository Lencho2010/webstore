package com.geoway.webstore.dao;

import com.geoway.webstore.entities.FitResult;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Lencho
 * @create 2021-08-22 14:57
 */
@Mapper
public interface FitResultDao {
    public Integer selectCount();

    public List<FitResult> selectForPage(@Param("startIndex") int startIndex, @Param("pageSize") int pageSize);

    public List<FitResult> selectByCode(@Param("code") String code);
}

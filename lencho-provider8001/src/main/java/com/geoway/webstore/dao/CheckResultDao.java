package com.geoway.webstore.dao;

import com.geoway.webstore.entities.CheckResult;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Lencho
 * @create 2021-08-22 14:44
 */
@Mapper
public interface CheckResultDao {
    public Integer selectCount();

    public List<CheckResult> selectForPage(@Param("startIndex") int startIndex, @Param("pageSize") int pageSize);

    public List<CheckResult> selectByCode(@Param("code") String code);
}

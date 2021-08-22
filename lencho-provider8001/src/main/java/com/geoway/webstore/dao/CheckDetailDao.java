package com.geoway.webstore.dao;

import com.geoway.webstore.entities.CheckDetail;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Lencho
 * @create 2021-08-22 14:50
 */
@Mapper
public interface CheckDetailDao {
    public Integer selectCount();

    public List<CheckDetail> selectForPage(@Param("startIndex") int startIndex, @Param("pageSize") int pageSize);

    public List<CheckDetail> selectByCode(@Param("code") String code);
}

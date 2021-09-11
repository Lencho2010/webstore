package com.geoway.webstore.dao;

import com.geoway.webstore.entities.CheckResultTotal;
import com.geoway.webstore.entities.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Lencho
 * @create 2021-08-21 17:34
 */
@Mapper
public interface CheckResultTotalDao {

    public Integer selectCount();

    public List<CheckResultTotal> selectForPage(@Param("startIndex") int startIndex, @Param("pageSize") int pageSize);

    public List<CheckResultTotal> selectByStatus(@Param("status") Integer status);

    public List<CheckResultTotal> selectByStatus2(@Param("list") List<Integer> list);

    List<CheckResultTotal> listByCode(@Param("taskName") String taskName);
}

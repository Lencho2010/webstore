package com.geoway.webstore.service;

import com.geoway.webstore.dto.CheckResultTotalDto;
import com.geoway.webstore.entities.CheckResultTotal;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Lencho
 * @create 2021-08-21 17:36
 */
public interface CheckResultTotalService {
    public Integer selectCount();

    public List<CheckResultTotal> selectForPage(int startIndex, int pageSize);

    PageInfo<CheckResultTotal> selectByStatus(Integer page, Integer rows, Integer status);

    PageInfo<CheckResultTotal> selectByStatus(Integer page, Integer rows, List<Integer> list);

    List<CheckResultTotalDto> listByCode(String taskName);
}

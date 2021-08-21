package com.geoway.webstore.service;

import com.geoway.webstore.entities.CheckResultTotal;

import java.util.List;

/**
 * @author Lencho
 * @create 2021-08-21 17:36
 */
public interface CheckResultTotalService {
    public Integer selectCount();

    public List<CheckResultTotal> selectForPage(int startIndex, int pageSize);
}

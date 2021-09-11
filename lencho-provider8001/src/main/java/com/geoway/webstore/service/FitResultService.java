package com.geoway.webstore.service;

import com.geoway.webstore.dto.FitResultDto;
import com.geoway.webstore.entities.FitResult;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Lencho
 * @create 2021-08-22 14:57
 */
public interface FitResultService {

    public Integer selectCount();

    public List<FitResult> selectForPage(@Param("startIndex") int startIndex, @Param("pageSize") int pageSize);

    public List<FitResult> selectByCode(@Param("code") String code);

    List<FitResultDto> listByCode(String code);
}

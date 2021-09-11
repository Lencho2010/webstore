package com.geoway.webstore.service;

import com.geoway.webstore.dto.CheckResultDto;
import com.geoway.webstore.entities.CheckResult;
import com.geoway.webstore.entities.CheckResultTotal;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Lencho
 * @create 2021-08-22 14:44
 */
public interface CheckResultService {

    public Integer selectCount();

    public List<CheckResult> selectForPage(@Param("startIndex") int startIndex, @Param("pageSize") int pageSize);

    public List<CheckResult> selectByCode(@Param("code") String code);

    List<CheckResultDto> listByCode(@Param("taskName") String taskName);
}

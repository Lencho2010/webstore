package com.geoway.webstore.service;

import com.geoway.webstore.dto.CheckDetailDto;
import com.geoway.webstore.dto.CheckResultDto;
import com.geoway.webstore.entities.CheckDetail;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Lencho
 * @create 2021-08-22 14:50
 */
public interface CheckDetailService {

    public Integer selectCount();

    public List<CheckDetail> selectForPage(@Param("startIndex") int startIndex, @Param("pageSize") int pageSize);

    public List<CheckDetail> selectByCode(@Param("code") String code);

    List<CheckDetailDto> listByCode(@Param("taskName") String taskName);
}

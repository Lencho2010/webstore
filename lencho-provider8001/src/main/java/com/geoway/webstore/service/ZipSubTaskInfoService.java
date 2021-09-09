package com.geoway.webstore.service;

import com.geoway.webstore.entities.ZipSubTaskInfo;

import java.util.List;

/**
 * @author Lencho
 * @create 2021-09-09 16:04
 * @desc
 */
public interface ZipSubTaskInfoService {
    List<ZipSubTaskInfo> listByCode(String taskName);
}

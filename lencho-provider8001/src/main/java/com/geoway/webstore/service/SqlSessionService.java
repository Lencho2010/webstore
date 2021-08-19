package com.geoway.webstore.service;

import com.geoway.webstore.comm.DataSourceName;
import com.geoway.webstore.dao.StudentMapper;
import com.geoway.webstore.util.DynamicSqlSession;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author Lencho
 * @create 2021-08-18 21:57
 */
//@Service
public class SqlSessionService {
    @Resource
    private DynamicSqlSession dynamicSqlSession;

    public List<Map> queryStus(){
        StudentMapper mapper = dynamicSqlSession.getMapper(DataSourceName.Primary, StudentMapper.class);
        return mapper.queryAll();
    }
}

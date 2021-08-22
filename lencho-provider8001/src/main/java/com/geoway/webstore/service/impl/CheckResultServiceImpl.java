package com.geoway.webstore.service.impl;

import com.geoway.webstore.dao.CheckResultDao;
import com.geoway.webstore.entities.CheckResult;
import com.geoway.webstore.service.CheckResultService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Lencho
 * @create 2021-08-22 14:45
 */
@Service
public class CheckResultServiceImpl implements CheckResultService {

    @Resource
    private CheckResultDao checkResultDao;

    @Override
    public Integer selectCount() {
        return checkResultDao.selectCount();
    }

    @Override
    public List<CheckResult> selectForPage(int startIndex, int pageSize) {
        return checkResultDao.selectForPage(startIndex, pageSize);
    }

    @Override
    public List<CheckResult> selectByCode(String code) {
        return checkResultDao.selectByCode(code);
    }
}

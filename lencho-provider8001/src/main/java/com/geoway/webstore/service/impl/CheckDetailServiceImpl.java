package com.geoway.webstore.service.impl;

import com.geoway.webstore.dao.CheckDetailDao;
import com.geoway.webstore.entities.CheckDetail;
import com.geoway.webstore.service.CheckDetailService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Lencho
 * @create 2021-08-22 14:50
 */
@Service
public class CheckDetailServiceImpl implements CheckDetailService {

    @Resource
    private CheckDetailDao checkDetailDao;

    @Override
    public Integer selectCount() {
        return checkDetailDao.selectCount();
    }

    @Override
    public List<CheckDetail> selectForPage(int startIndex, int pageSize) {
        return checkDetailDao.selectForPage(startIndex, pageSize);
    }

    @Override
    public List<CheckDetail> selectByCode(String code) {
        return checkDetailDao.selectByCode(code);
    }
}

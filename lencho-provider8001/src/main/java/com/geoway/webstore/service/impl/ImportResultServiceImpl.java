package com.geoway.webstore.service.impl;

import com.geoway.webstore.dao.ImportResultDao;
import com.geoway.webstore.entities.ImportResult;
import com.geoway.webstore.service.ImportResultService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Lencho
 * @create 2021-08-22 15:02
 */
@Service
public class ImportResultServiceImpl implements ImportResultService {

    @Resource
    private ImportResultDao importResultDao;

    @Override
    public Integer selectCount() {
        return importResultDao.selectCount();
    }

    @Override
    public List<ImportResult> selectForPage(int startIndex, int pageSize) {
        return importResultDao.selectForPage(startIndex, pageSize);
    }

    @Override
    public List<ImportResult> selectByCode(String code) {
        return importResultDao.selectByCode(code);
    }
}

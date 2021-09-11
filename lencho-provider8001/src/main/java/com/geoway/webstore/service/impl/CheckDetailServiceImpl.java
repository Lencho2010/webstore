package com.geoway.webstore.service.impl;

import com.geoway.webstore.converter.CheckDetailConverter;
import com.geoway.webstore.dao.CheckDetailDao;
import com.geoway.webstore.dto.CheckDetailDto;
import com.geoway.webstore.entities.CheckDetail;
import com.geoway.webstore.service.CheckDetailService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.IntStream;

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

    @Override
    public List<CheckDetailDto> listByCode(String taskName) {
        List<CheckDetail> checkDetails = checkDetailDao.selectByCode(taskName);
        List<CheckDetailDto> dtoList = CheckDetailConverter.Instance.domain2dto(checkDetails);
        IntStream.range(0, dtoList.size()).forEach(i -> dtoList.get(i).setIndex(i + 1));
        return dtoList;
    }
}

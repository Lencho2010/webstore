package com.geoway.webstore.service.impl;

import com.geoway.webstore.converter.FitResultConverter;
import com.geoway.webstore.dao.FitResultDao;
import com.geoway.webstore.dto.FitResultDto;
import com.geoway.webstore.entities.FitResult;
import com.geoway.webstore.service.FitResultService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.IntStream;

/**
 * @author Lencho
 * @create 2021-08-22 14:57
 */
@Service
public class FitResultServiceImpl implements FitResultService {

    @Resource
    private FitResultDao fitResultDao;

    @Override
    public Integer selectCount() {
        return fitResultDao.selectCount();
    }

    @Override
    public List<FitResult> selectForPage(int startIndex, int pageSize) {
        return fitResultDao.selectForPage(startIndex, pageSize);
    }

    @Override
    public List<FitResult> selectByCode(String code) {
        return fitResultDao.selectByCode(code);
    }

    @Override
    public List<FitResultDto> listByCode(String code) {
        List<FitResult> fitResults = fitResultDao.selectByCode(code);
        List<FitResultDto> dtoList = FitResultConverter.Instance.domain2dto(fitResults);
        IntStream.range(0, dtoList.size()).forEach(i -> dtoList.get(i).setIndex(i + 1));
        return dtoList;
    }
}

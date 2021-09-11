package com.geoway.webstore.service.impl;

import com.geoway.webstore.converter.CheckResultTotalConverter;
import com.geoway.webstore.dao.CheckResultTotalDao;
import com.geoway.webstore.dto.CheckResultTotalDto;
import com.geoway.webstore.entities.CheckResultTotal;
import com.geoway.webstore.service.CheckResultTotalService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

/**
 * @author Lencho
 * @create 2021-08-21 17:37
 */
@Service
public class CheckResultTotalServiceImpl implements CheckResultTotalService {

    @Resource
    CheckResultTotalDao checkResultTotalDao;

    @Override
    public Integer selectCount() {
        return checkResultTotalDao.selectCount();
    }

    @Override
    public List<CheckResultTotal> selectForPage(int startIndex, int pageSize) {

        List<CheckResultTotal> list = checkResultTotalDao.selectForPage(startIndex, pageSize);
        Random random = new Random();
        for (CheckResultTotal item : list) {
            //item.setIndex(startIndex);
            /*item.setCreator("admin");
            item.setNum(random.nextInt(50) + 50);*/
            startIndex++;
        }
        return list;
    }

    @Override
    public PageInfo<CheckResultTotal> selectByStatus(Integer page, Integer rows, Integer status) {
        PageHelper.startPage(page, rows);
        List<CheckResultTotal> list = checkResultTotalDao.selectByStatus(status);
        Random random = new Random();
        int startIndex = (page - 1) * rows + 1;
        for (CheckResultTotal item : list) {
            //item.setIndex(startIndex);
            /*item.setCreator("admin");
            item.setNum(random.nextInt(50) + 50);*/
            startIndex++;
        }
        return new PageInfo<>(list);
    }

    @Override
    public PageInfo<CheckResultTotal> selectByStatus(Integer page, Integer rows, List<Integer> list) {
        PageHelper.startPage(page, rows);
        List<CheckResultTotal> rets = checkResultTotalDao.selectByStatus2(list);
        Random random = new Random();
        int startIndex = (page - 1) * rows + 1;
        for (CheckResultTotal item : rets) {
            //item.setIndex(startIndex);
            /*item.setCreator("admin");
            item.setNum(random.nextInt(50) + 50);*/
            startIndex++;
        }
        return new PageInfo<>(rets);
    }

    @Override
    public List<CheckResultTotalDto> listByCode(String taskName) {
        List<CheckResultTotal> checkResultTotals = checkResultTotalDao.listByCode(taskName);
        List<CheckResultTotalDto> dtoList = CheckResultTotalConverter.Instance.domain2dto(checkResultTotals);
        IntStream.range(0, dtoList.size()).forEach(index -> dtoList.get(index).setIndex(index + 1));
        return dtoList;
    }
}

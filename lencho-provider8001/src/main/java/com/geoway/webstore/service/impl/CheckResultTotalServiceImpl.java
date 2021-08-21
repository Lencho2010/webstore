package com.geoway.webstore.service.impl;

import com.geoway.webstore.dao.CheckResultTotalDao;
import com.geoway.webstore.entities.CheckResultTotal;
import com.geoway.webstore.service.CheckResultTotalService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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
            item.setIndex(startIndex);
            item.setCreator("admin");
            item.setNum(random.nextInt(50) + 50);
            startIndex++;
        }
        return list;

        /*List<CheckResultTotal> list = new ArrayList<>();
        CheckResultTotal model = new CheckResultTotal();
        model.setIndex(1);
        list.add(model);

        model = new CheckResultTotal();
        model.setIndex(2);
        list.add(model);

        return list;*/
    }
}

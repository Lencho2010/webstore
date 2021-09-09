package com.geoway.webstore.service.impl;

import com.geoway.webstore.converter.ZipFileInfoConverter;
import com.geoway.webstore.dao.ZipFileInfoDao;
import com.geoway.webstore.dto.ZipFileInfoDto;
import com.geoway.webstore.entities.ZipFileInfo;
import com.geoway.webstore.service.ZipFileInfoService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.IntStream;

/**
 * @author Lencho
 * @create 2021-08-22 15:08
 */
@Service
public class ZipFileInfoServiceImpl implements ZipFileInfoService {

    @Resource
    private ZipFileInfoDao zipFileInfoDao;

    @Override
    public Integer selectCount() {
        return zipFileInfoDao.selectCount();
    }

    @Override
    public PageInfo listByStatus(int page, int rows, String taskName, List<Integer> status) {
        PageHelper.startPage(page, rows);
        List<ZipFileInfo> list = zipFileInfoDao.listByStatus(taskName, status);
        PageInfo pageInfo = new PageInfo<>(list);
        List<ZipFileInfo> zipFileInfoList = pageInfo.getList();
        List<ZipFileInfoDto> dtoList = ZipFileInfoConverter.Instance.domain2dto(zipFileInfoList);
        IntStream.range(0, dtoList.size()).forEach(i -> {
                    ZipFileInfoDto dto = dtoList.get(i);
                    dto.setIndex((page - 1) * rows + 1 + i);
                    /*dto.setProgress((int) (50 + Math.random() * 50));
                    dto.setStatus((int) (Math.random() * 5) - 1);*/
                }
        );
        pageInfo.setList(dtoList);
        return pageInfo;
    }

    @Override
    public List<ZipFileInfo> selectForPage(int startIndex, int pageSize) {
        return zipFileInfoDao.selectForPage(startIndex, pageSize);
    }

    @Override
    public ZipFileInfoDto selectByName(String fileName) {
        ZipFileInfo zipFileInfo = zipFileInfoDao.selectByName(fileName);
        return ZipFileInfoConverter.Instance.domain2dto(zipFileInfo);
    }

    @Override
    public boolean deleteById(Integer id) {
        return zipFileInfoDao.deleteById(id);
    }

    @Override
    public boolean updateStatus(ZipFileInfoDto dto) {
        return zipFileInfoDao.updateStatus(dto);
    }
}

package com.geoway.webstore.converter;

import com.geoway.webstore.dto.ZipFileInfoDto;
import com.geoway.webstore.dto.ZipTaskInfoDto;
import com.geoway.webstore.entities.ZipFileInfo;
import com.geoway.webstore.entities.ZipTaskInfo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * @author Lencho
 * @create 2021-09-09 16:32
 * @desc
 */
@Mapper
public interface ZipTaskInfoConverter {

    ZipTaskInfoConverter Instance = Mappers.getMapper(ZipTaskInfoConverter.class);

    @Mappings({
            @Mapping(target = "children", ignore = true)
    })
    ZipTaskInfoDto domain2dto(ZipTaskInfo domain);

    List<ZipTaskInfoDto> domain2dto(List<ZipTaskInfo> domain);
}

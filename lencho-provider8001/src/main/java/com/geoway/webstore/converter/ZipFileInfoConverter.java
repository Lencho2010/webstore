package com.geoway.webstore.converter;

import com.geoway.webstore.dto.ZipFileInfoDto;
import com.geoway.webstore.entities.ZipFileInfo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @author Lencho
 * @create 2021-09-08 19:26
 * @desc
 */
@Mapper
public interface ZipFileInfoConverter {

    ZipFileInfoConverter Instance = Mappers.getMapper(ZipFileInfoConverter.class);

    @Mappings({
            @Mapping(target = "id", source = "oid"),
            @Mapping(target = "creator", ignore = true),
            @Mapping(target = "taskName", source = "fileName"),
            @Mapping(target = "index", ignore = true),
            @Mapping(target = "tbCount", expression = "java(com.geoway.webstore.util.ExtractUtil.extractTbCount(domain.getJson()))")
    })
    ZipFileInfoDto domain2dto(ZipFileInfo domain);

    List<ZipFileInfoDto> domain2dto(List<ZipFileInfo> domain);
}

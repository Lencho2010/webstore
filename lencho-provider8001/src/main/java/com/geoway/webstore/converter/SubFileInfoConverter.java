package com.geoway.webstore.converter;

import com.geoway.webstore.dto.SubFileInfoDto;
import com.geoway.webstore.dto.ZipFileInfoDto;
import com.geoway.webstore.entities.SubFileInfo;
import com.geoway.webstore.entities.ZipFileInfo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * @author Lencho
 * @create 2021-09-09 17:49
 * @desc
 */
@Mapper
public interface SubFileInfoConverter {

    SubFileInfoConverter Instance = Mappers.getMapper(SubFileInfoConverter.class);

    @Mappings({
            @Mapping(target = "taskName", source = "code"),
            @Mapping(target = "dataName", source = "fileName"),
            @Mapping(target = "dataPath", source = "filePath"),
            @Mapping(target = "index", ignore = true),
    })
    SubFileInfoDto domain2dto(SubFileInfo domain);

    List<SubFileInfoDto> domain2dto(List<SubFileInfo> domain);
}

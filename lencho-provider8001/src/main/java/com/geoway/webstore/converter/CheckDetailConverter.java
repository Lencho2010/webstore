package com.geoway.webstore.converter;

import com.geoway.webstore.dto.CheckDetailDto;
import com.geoway.webstore.dto.CheckResultDto;
import com.geoway.webstore.entities.CheckDetail;
import com.geoway.webstore.entities.CheckResult;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * @Author: Lencho
 * @CreateTime: 2021/9/11 10:19
 * @Description:
 */
@Mapper
public interface CheckDetailConverter {
    CheckDetailConverter Instance = Mappers.getMapper(CheckDetailConverter.class);

    @Mappings({
            @Mapping(target = "finalResult", source = "checkMsg"),
            @Mapping(target = "batch", source = "code"),
            @Mapping(target = "index", ignore = true),
            @Mapping(target = "tbbh", source = "jctbBh"),
    })
    CheckDetailDto domain2dto(CheckDetail domain);

    List<CheckDetailDto> domain2dto(List<CheckDetail> domain);
}

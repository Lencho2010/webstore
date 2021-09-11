package com.geoway.webstore.converter;

import com.geoway.webstore.dto.CheckResultDto;
import com.geoway.webstore.dto.CheckResultTotalDto;
import com.geoway.webstore.entities.CheckResult;
import com.geoway.webstore.entities.CheckResultTotal;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * @Author: Lencho
 * @CreateTime: 2021/9/11 10:06
 * @Description:
 */
@Mapper
public interface CheckResultConverter {
    CheckResultConverter Instance = Mappers.getMapper(CheckResultConverter.class);

    @Mappings({
            @Mapping(target = "checkInfo", source = "checkMsg"),
            @Mapping(target = "finalResult", source = "checkInfo"),
            @Mapping(target = "batch", source = "code"),
            @Mapping(target = "index", ignore = true),
    })
    CheckResultDto domain2dto(CheckResult domain);

    List<CheckResultDto> domain2dto(List<CheckResult> domain);
}

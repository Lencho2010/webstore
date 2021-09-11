package com.geoway.webstore.converter;

import com.geoway.webstore.dto.CheckResultTotalDto;
import com.geoway.webstore.dto.FitResultDto;
import com.geoway.webstore.entities.CheckResultTotal;
import com.geoway.webstore.entities.FitResult;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * @Author: Lencho
 * @CreateTime: 2021/9/11 11:00
 * @Description:
 */
@Mapper
public interface FitResultConverter {
    FitResultConverter Instance = Mappers.getMapper(FitResultConverter.class);

    @Mappings({
            @Mapping(target = "fail", source = "errorReason"),
            @Mapping(target = "batch", source = "code"),
            @Mapping(target = "index", ignore = true),
    })
    FitResultDto domain2dto(FitResult domain);

    List<FitResultDto> domain2dto(List<FitResult> domain);
}

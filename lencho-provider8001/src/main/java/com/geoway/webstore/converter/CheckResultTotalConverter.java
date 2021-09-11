package com.geoway.webstore.converter;

import com.geoway.webstore.dto.CheckResultTotalDto;
import com.geoway.webstore.entities.CheckResultTotal;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * @Author: Lencho
 * @CreateTime: 2021/9/11 9:52
 * @Description:
 */
@Mapper
public interface CheckResultTotalConverter {
    CheckResultTotalConverter Instance = Mappers.getMapper(CheckResultTotalConverter.class);

    @Mappings({
            @Mapping(target = "info", source = "checkMsg"),
            @Mapping(target = "batch", source = "taskName"),
            @Mapping(target = "index", ignore = true),
    })
    CheckResultTotalDto domain2dto(CheckResultTotal domain);

    List<CheckResultTotalDto> domain2dto(List<CheckResultTotal> domain);
}

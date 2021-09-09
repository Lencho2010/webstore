package com.geoway.webstore.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Lencho
 * @create 2021-09-09 17:48
 * @desc
 */
@Data
@NoArgsConstructor
public class SubFileInfoDto {

    private Integer index;
    private String taskName;
    private String dataName;
    private String dataPath;

    private String countyCode;
    private String countyName;

    private String cityCode;
    private String cityName;

    private String provinceCode;
    private String provinceName;
}


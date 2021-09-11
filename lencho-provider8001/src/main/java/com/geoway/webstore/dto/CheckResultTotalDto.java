package com.geoway.webstore.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: Lencho
 * @CreateTime: 2021/9/11 9:50
 * @Description:
 */
@Data
@NoArgsConstructor
public class CheckResultTotalDto {
    private Integer index;
    //批次
    private String batch;

    private String countyCode;
    private String countyName;

    private String cityCode;
    private String cityName;

    private String provinceCode;
    private String provinceName;

    private Integer status;
    private String info;
}

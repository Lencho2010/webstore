package com.geoway.webstore.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: Lencho
 * @CreateTime: 2021/9/11 10:18
 * @Description:
 */
@Data
@NoArgsConstructor
public class CheckDetailDto {

    private Integer index;
    private String batch;
    private String countyCode;
    private String countyName;

    private String cityCode;
    private String cityName;

    private String provinceCode;
    private String provinceName;

    private String ruleCode;
    private String ruleName;

    //监测图斑编号
    private String tbbh;
    //质检不通过信息
    private String finalResult;
}

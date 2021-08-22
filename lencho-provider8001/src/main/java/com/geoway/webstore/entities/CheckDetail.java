package com.geoway.webstore.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Lencho
 * @create 2021-08-22 14:46
 * @desc 质检不通过图斑信息表
 */
@Data
@NoArgsConstructor
public class CheckDetail {

    private String code;
    private String countyCode;
    private String countyName;

    private String cityCode;
    private String cityName;

    private String provinceCode;
    private String provinceName;

    private String ruleCode;
    private String ruleName;

    //监测图斑编号
    private String jctbBh;
    //质检不通过信息
    private String checkMsg;
}

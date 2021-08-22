package com.geoway.webstore.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.geoway.webstore.constant.Constant;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author Lencho
 * @create 2021-08-22 14:39
 * @desc 质检明细结果表，一个批次的一个县一个规则一条记录
 */
@Data
@NoArgsConstructor
public class CheckResult {

    private String code;

    private String countyCode;
    private String countyName;

    private String cityCode;
    private String cityName;

    private String provinceCode;
    private String provinceName;

    private String ruleCode;
    private String ruleName;

    //1-通过；0-不通过
    private Integer checkResult;

    private String checkMsg;

    @JsonFormat(pattern= Constant.DATE_FORMAT, timezone = Constant.TIME_ZONE)
    private Date startTime;

    @JsonFormat(pattern= Constant.DATE_FORMAT, timezone = Constant.TIME_ZONE)
    private Date endTime;

    private String checkInfo;
}

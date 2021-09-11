package com.geoway.webstore.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.geoway.webstore.constant.Constant;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @Author: Lencho
 * @CreateTime: 2021/9/11 10:03
 * @Description:
 */
@Data
@NoArgsConstructor
public class CheckResultDto {

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

    //1-通过；0-不通过
    private Integer checkResult;

    //质检结果-checkMsg
    private String checkInfo;

    @JsonFormat(pattern = Constant.DATE_FORMAT, timezone = Constant.TIME_ZONE)
    private Date startTime;

    @JsonFormat(pattern = Constant.DATE_FORMAT, timezone = Constant.TIME_ZONE)
    private Date endTime;
    //结果信息- checkInfo
    private String finalResult;
}

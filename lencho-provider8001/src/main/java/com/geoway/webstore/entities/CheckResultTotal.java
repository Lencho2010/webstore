package com.geoway.webstore.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.geoway.webstore.constant.Constant;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author Lencho
 * @create 2021-08-21 17:28
 * @desc 质检总体结果表，一个批次的一个县一条记录
 */
@Data
@NoArgsConstructor
public class CheckResultTotal {

    private String taskName;
    private Integer status;

    private String countyCode;
    private String countyName;

    private String cityCode;
    private String cityName;

    private String provinceCode;
    private String provinceName;

    @JsonFormat(pattern= Constant.DATE_FORMAT, timezone = Constant.TIME_ZONE)
    private Date startTime;

    @JsonFormat(pattern= Constant.DATE_FORMAT, timezone = Constant.TIME_ZONE)
    private Date endTime;

    //创建人信息
    private String checkMsg;

}

package com.geoway.webstore.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.geoway.webstore.constant.Constant;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author Lencho
 * @create 2021-08-22 14:53
 * @desc 套合结果记录表
 */
@Data
@NoArgsConstructor
public class FitResult {

    private String code;

    private String countyCode;
    private String countyName;

    private String cityCode;
    private String cityName;

    private String provinceCode;
    private String provinceName;

    private Integer originCount;
    private Integer resultCount;

    //1-处理中；2-成功；404-失败
    private Integer status;

    //失败原因
    private String errorReason;

    //处理信息
    private String info;

    @JsonFormat(pattern = Constant.DATE_FORMAT, timezone = Constant.TIME_ZONE)
    private Date startTime;

    @JsonFormat(pattern = Constant.DATE_FORMAT, timezone = Constant.TIME_ZONE)
    private Date endTime;
}

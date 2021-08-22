package com.geoway.webstore.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.geoway.webstore.constant.Constant;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author Lencho
 * @create 2021-08-22 14:59
 */
@Data
@NoArgsConstructor
public class ImportResult {

    private String code;

    private String countyCode;
    private String countyName;

    private String cityCode;
    private String cityName;

    private String provinceCode;
    private String provinceName;

    private Integer status;

    private String msg;

    @JsonFormat(pattern= Constant.DATE_FORMAT, timezone = Constant.TIME_ZONE)
    private Date startTime;

    @JsonFormat(pattern= Constant.DATE_FORMAT, timezone = Constant.TIME_ZONE)
    private Date endTime;
}

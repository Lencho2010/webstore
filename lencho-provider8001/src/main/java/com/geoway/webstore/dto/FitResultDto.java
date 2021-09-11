package com.geoway.webstore.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.geoway.webstore.constant.Constant;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @Author: Lencho
 * @CreateTime: 2021/9/11 10:58
 * @Description:
 */
@Data
@NoArgsConstructor
public class FitResultDto {

    private Integer index;
    private String batch;

    private String countyCode;
    private String countyName;

    private String cityCode;
    private String cityName;

    private String provinceCode;
    private String provinceName;

    //原个数
    private Integer originCount;
    private Integer resultCount;

    //1-处理中；2-成功；404-失败
    private Integer status;

    //失败原因
    private String fail;

    //处理信息
    private String info;

}

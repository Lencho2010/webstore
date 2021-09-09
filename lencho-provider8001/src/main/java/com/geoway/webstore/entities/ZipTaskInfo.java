package com.geoway.webstore.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.geoway.webstore.constant.Constant;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author Lencho
 * @create 2021-09-09 15:49
 * @desc
 */
@Data
@NoArgsConstructor
public class ZipTaskInfo {
    private Integer key;
    private String taskName;
    private String stepInfo;

    @JsonFormat(pattern= Constant.DATE_FORMAT, timezone = Constant.TIME_ZONE)
    private Date startTime;

    @JsonFormat(pattern= Constant.DATE_FORMAT, timezone = Constant.TIME_ZONE)
    private Date endTime;

    private Integer progress;
    private Integer status;

}

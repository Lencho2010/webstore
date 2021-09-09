package com.geoway.webstore.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.geoway.webstore.constant.Constant;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author Lencho
 * @create 2021-09-09 15:51
 * @desc
 */
@Data
@NoArgsConstructor
public class ZipSubTaskInfo {

    private Integer key;
    private Integer parentKey;
    private String taskName;
    private String stepInfo;

    @JsonFormat(pattern= Constant.DATE_FORMAT, timezone = Constant.TIME_ZONE)
    private Date startTime;

    @JsonFormat(pattern= Constant.DATE_FORMAT, timezone = Constant.TIME_ZONE)
    private Date endTime;

    private String logInfo;
    private Integer status;
}

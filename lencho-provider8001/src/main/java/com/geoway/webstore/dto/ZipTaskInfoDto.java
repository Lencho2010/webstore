package com.geoway.webstore.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.geoway.webstore.constant.Constant;
import com.geoway.webstore.entities.ZipSubTaskInfo;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

/**
 * @author Lencho
 * @create 2021-09-09 16:29
 * @desc
 */
@Data
@NoArgsConstructor
public class ZipTaskInfoDto {
    private Integer key;
    private String taskName;
    private String stepInfo;

    @JsonFormat(pattern= Constant.DATE_FORMAT, timezone = Constant.TIME_ZONE)
    private Date startTime;

    @JsonFormat(pattern= Constant.DATE_FORMAT, timezone = Constant.TIME_ZONE)
    private Date endTime;

    private Integer progress;
    private Integer status;

    private List<ZipSubTaskInfo> children;
}

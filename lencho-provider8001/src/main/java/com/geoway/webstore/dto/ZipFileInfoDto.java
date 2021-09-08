package com.geoway.webstore.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.geoway.webstore.constant.Constant;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author Lencho
 * @create 2021-09-08 19:19
 * @desc
 */
@Data
@NoArgsConstructor
public class ZipFileInfoDto {
    private Integer id;
    private Integer index;
    private String taskName;
    private String creator = "admin";
    //private String filePath;
    //private Integer isHandle;
    //private String note;

    @JsonFormat(pattern = Constant.DATE_FORMAT, timezone = Constant.TIME_ZONE)
    private Date startTime;

    @JsonFormat(pattern = Constant.DATE_FORMAT, timezone = Constant.TIME_ZONE)
    private Date endTime;

    //检测图斑数量
    private Integer tbCount;

    private Integer progress;
    private Integer status;
}

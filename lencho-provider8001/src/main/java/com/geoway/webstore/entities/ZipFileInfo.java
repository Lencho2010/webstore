package com.geoway.webstore.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.geoway.webstore.constant.Constant;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author Lencho
 * @create 2021-08-22 15:02
 */
@Data
@NoArgsConstructor
public class ZipFileInfo {

    private Integer oid;

    private String fileName;
    private String filePath;
    private Integer isHandle;
    private String note;
    private String json;

    @JsonFormat(pattern= Constant.DATE_FORMAT, timezone = Constant.TIME_ZONE)
    private Date startTime;

    @JsonFormat(pattern= Constant.DATE_FORMAT, timezone = Constant.TIME_ZONE)
    private Date endTime;

    private Integer progress;
    private Integer status;
}

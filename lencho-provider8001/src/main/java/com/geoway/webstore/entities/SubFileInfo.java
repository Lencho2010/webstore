package com.geoway.webstore.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Lencho
 * @create 2021-08-22 15:05
 */
@Data
@NoArgsConstructor
public class SubFileInfo {
    private Integer oid;
    private Integer taskId;
    private String code;
    private String fileName;
    private String filePath;

    private String countyCode;
    private String countyName;

    private String cityCode;
    private String cityName;

    private String provinceCode;
    private String provinceName;
}

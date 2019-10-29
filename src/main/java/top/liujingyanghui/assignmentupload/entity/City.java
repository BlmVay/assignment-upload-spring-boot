package top.liujingyanghui.assignmentupload.entity;

import lombok.Data;

/**
 * 城市
 */
@Data
public class City {

    private Integer id;

    /**
     * 城市名称
     */
    private String name;

    /**
     * 省份ID
     */
    private Integer provinceId;
}

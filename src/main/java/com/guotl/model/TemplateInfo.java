package com.guotl.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by guotianlin on 2018/4/8.
 */
@Data
public class TemplateInfo {
    private String id;

    private String name;

    private String remark;

    private String type;

    private String file_type;

    private String is_system;

    private String user_id;

    private String is_deleted;
}

package com.guotl.model;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by guotianlin on 2018/4/8.
 */
//@Getter
//@Setter

public class TemplateInfo {
    private String id;

    private String name;

    private String remark;

    private String type;

    private String file_type;

    private String is_system;

    private String user_id;

    private String is_deleted;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFile_type() {
        return file_type;
    }

    public void setFile_type(String file_type) {
        this.file_type = file_type;
    }

    public String getIs_system() {
        return is_system;
    }

    public void setIs_system(String is_system) {
        this.is_system = is_system;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getIs_deleted() {
        return is_deleted;
    }

    public void setIs_deleted(String is_deleted) {
        this.is_deleted = is_deleted;
    }
}

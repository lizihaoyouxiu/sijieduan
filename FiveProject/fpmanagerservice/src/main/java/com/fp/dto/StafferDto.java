package com.fp.dto;

/**
 * Created by DELL on 2018/3/28.
 */
public class StafferDto {

    private long id;
    private String staffername;
    private String stafferstate;
    private String stafferwages;
    private String createdAt;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStaffername() {
        return staffername;
    }

    public void setStaffername(String staffername) {
        this.staffername = staffername;
    }

    public String getStafferstate() {
        return stafferstate;
    }

    public void setStafferstate(String stafferstate) {
        this.stafferstate = stafferstate;
    }

    public String getStafferwages() {
        return stafferwages;
    }

    public void setStafferwages(String stafferwages) {
        this.stafferwages = stafferwages;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }
}

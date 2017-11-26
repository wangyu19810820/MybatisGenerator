package com.base;

import java.util.Date;

public class BaseModel {

    private String addUserId;
    private String addUser;
    private Date addDttm;
    private String lastUpdUserId;
    private String lastUpdUser;
    private Date lastUpdDttm;
    private Boolean enable;

    public String getAddUserId() {
        return addUserId;
    }

    public void setAddUserId(String addUserId) {
        this.addUserId = addUserId;
    }

    public String getAddUser() {
        return addUser;
    }

    public void setAddUser(String addUser) {
        this.addUser = addUser;
    }

    public Date getAddDttm() {
        return addDttm;
    }

    public void setAddDttm(Date addDttm) {
        this.addDttm = addDttm;
    }

    public String getLastUpdUserId() {
        return lastUpdUserId;
    }

    public void setLastUpdUserId(String lastUpdUserId) {
        this.lastUpdUserId = lastUpdUserId;
    }

    public String getLastUpdUser() {
        return lastUpdUser;
    }

    public void setLastUpdUser(String lastUpdUser) {
        this.lastUpdUser = lastUpdUser;
    }

    public Date getLastUpdDttm() {
        return lastUpdDttm;
    }

    public void setLastUpdDttm(Date lastUpdDttm) {
        this.lastUpdDttm = lastUpdDttm;
    }

    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    @Override
    public String toString() {
        return "BaseModel{" +
                "addUserId='" + addUserId + '\'' +
                ", addUser='" + addUser + '\'' +
                ", addDttm=" + addDttm +
                ", lastUpdUserId='" + lastUpdUserId + '\'' +
                ", lastUpdUser='" + lastUpdUser + '\'' +
                ", lastUpdDttm=" + lastUpdDttm +
                ", enable=" + enable +
                '}';
    }
}

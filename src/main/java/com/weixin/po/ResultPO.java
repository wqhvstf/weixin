package com.weixin.po;

import java.util.Date;

public class ResultPO {
    private String sguid;

    private String sopenid;

    private Integer ifirndhelp;

    private String sfrindopenid;

    private Double famount;

    private Date dgametime;

    public String getSguid() {
        return sguid;
    }

    public void setSguid(String sguid) {
        this.sguid = sguid == null ? null : sguid.trim();
    }

    public String getSopenid() {
        return sopenid;
    }

    public void setSopenid(String sopenid) {
        this.sopenid = sopenid == null ? null : sopenid.trim();
    }

    public Integer getIfirndhelp() {
        return ifirndhelp;
    }

    public void setIfirndhelp(Integer ifirndhelp) {
        this.ifirndhelp = ifirndhelp;
    }

    public String getSfrindopenid() {
        return sfrindopenid;
    }

    public void setSfrindopenid(String sfrindopenid) {
        this.sfrindopenid = sfrindopenid == null ? null : sfrindopenid.trim();
    }

    public Double getFamount() {
        return famount;
    }

    public void setFamount(Double famount) {
        this.famount = famount;
    }

    public Date getDgametime() {
        return dgametime;
    }

    public void setDgametime(Date dgametime) {
        this.dgametime = dgametime;
    }
}
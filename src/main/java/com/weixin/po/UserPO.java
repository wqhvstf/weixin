package com.weixin.po;

public class UserPO {
    private String sguid;

    private String smemberid;

    private String sopenid;

    private String smobile;

    private String snickname;

    public String getSguid() {
        return sguid;
    }

    public void setSguid(String sguid) {
        this.sguid = sguid == null ? null : sguid.trim();
    }

    public String getSmemberid() {
        return smemberid;
    }

    public void setSmemberid(String smemberid) {
        this.smemberid = smemberid == null ? null : smemberid.trim();
    }

    public String getSopenid() {
        return sopenid;
    }

    public void setSopenid(String sopenid) {
        this.sopenid = sopenid == null ? null : sopenid.trim();
    }

    public String getSmobile() {
        return smobile;
    }

    public void setSmobile(String smobile) {
        this.smobile = smobile == null ? null : smobile.trim();
    }

    public String getSnickname() {
        return snickname;
    }

    public void setSnickname(String snickname) {
        this.snickname = snickname == null ? null : snickname.trim();
    }
}
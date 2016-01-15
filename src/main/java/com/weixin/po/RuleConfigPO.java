package com.weixin.po;

import java.util.Date;

public class RuleConfigPO {
    private String sguid;

    private Date sactivitydate;

    private Integer imyselefcount;

    private Integer imyselefaccuratecount;

    private Integer ftotalamount;

    private Double dfrindprobability;

    private Integer ifrindcount;

    private Double dmyselefmax;

    private Double dmyselefmin;

    private Double dsevenfrindmax;

    private Double dsevenfrindmin;

    private Double dthridfrindmax;

    private Double dthridfrindmin;

    public String getSguid() {
        return sguid;
    }

    public void setSguid(String sguid) {
        this.sguid = sguid == null ? null : sguid.trim();
    }

    public Date getSactivitydate() {
        return sactivitydate;
    }

    public void setSactivitydate(Date sactivitydate) {
        this.sactivitydate = sactivitydate;
    }

    public Integer getImyselefcount() {
        return imyselefcount;
    }

    public void setImyselefcount(Integer imyselefcount) {
        this.imyselefcount = imyselefcount;
    }

    public Integer getImyselefaccuratecount() {
        return imyselefaccuratecount;
    }

    public void setImyselefaccuratecount(Integer imyselefaccuratecount) {
        this.imyselefaccuratecount = imyselefaccuratecount;
    }

    public Integer getFtotalamount() {
        return ftotalamount;
    }

    public void setFtotalamount(Integer ftotalamount) {
        this.ftotalamount = ftotalamount;
    }

    public Double getDfrindprobability() {
        return dfrindprobability;
    }

    public void setDfrindprobability(Double dfrindprobability) {
        this.dfrindprobability = dfrindprobability;
    }

    public Integer getIfrindcount() {
        return ifrindcount;
    }

    public void setIfrindcount(Integer ifrindcount) {
        this.ifrindcount = ifrindcount;
    }

    public Double getDmyselefmax() {
        return dmyselefmax;
    }

    public void setDmyselefmax(Double dmyselefmax) {
        this.dmyselefmax = dmyselefmax;
    }

    public Double getDmyselefmin() {
        return dmyselefmin;
    }

    public void setDmyselefmin(Double dmyselefmin) {
        this.dmyselefmin = dmyselefmin;
    }

    public Double getDsevenfrindmax() {
        return dsevenfrindmax;
    }

    public void setDsevenfrindmax(Double dsevenfrindmax) {
        this.dsevenfrindmax = dsevenfrindmax;
    }

    public Double getDsevenfrindmin() {
        return dsevenfrindmin;
    }

    public void setDsevenfrindmin(Double dsevenfrindmin) {
        this.dsevenfrindmin = dsevenfrindmin;
    }

    public Double getDthridfrindmax() {
        return dthridfrindmax;
    }

    public void setDthridfrindmax(Double dthridfrindmax) {
        this.dthridfrindmax = dthridfrindmax;
    }

    public Double getDthridfrindmin() {
        return dthridfrindmin;
    }

    public void setDthridfrindmin(Double dthridfrindmin) {
        this.dthridfrindmin = dthridfrindmin;
    }
}
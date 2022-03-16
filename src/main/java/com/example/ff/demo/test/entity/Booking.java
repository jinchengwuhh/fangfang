package com.example.ff.demo.test.entity;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author fangfang
 * @since 2022-03-16
 */
public class Booking implements Serializable {

    private static final long serialVersionUID = 1L;

    private String labId;

    private String labName;

    private String startTime;

    private String endTime;

    private String usefor;

    private String mobile;

    private String other;

    private String uId;

    private String bId;

    private String check;

    private String tel;


    public String getLabId() {
        return labId;
    }

    public void setLabId(String labId) {
        this.labId = labId;
    }

    public String getLabName() {
        return labName;
    }

    public void setLabName(String labName) {
        this.labName = labName;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getUsefor() {
        return usefor;
    }

    public void setUsefor(String usefor) {
        this.usefor = usefor;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public String getbId() {
        return bId;
    }

    public void setbId(String bId) {
        this.bId = bId;
    }

    public String getCheck() {
        return check;
    }

    public void setCheck(String check) {
        this.check = check;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "Booking{" +
        "labId=" + labId +
        ", labName=" + labName +
        ", startTime=" + startTime +
        ", endTime=" + endTime +
        ", usefor=" + usefor +
        ", mobile=" + mobile +
        ", other=" + other +
        ", uId=" + uId +
        ", bId=" + bId +
        ", check=" + check +
        ", tel=" + tel +
        "}";
    }
}

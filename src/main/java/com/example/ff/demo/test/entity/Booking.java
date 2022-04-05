package com.example.ff.demo.test.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author fangfang
 * @since 2022-03-31
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
    @TableId(value = "u_id", type = IdType.AUTO)

    private String uId;

    private Integer bId;

    private String checkk;

    private String tel;

    private String code;


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

    public Integer getbId() {
        return bId;
    }

    public void setbId(Integer bId) {
        this.bId = bId;
    }

    public String getCheckk() {
        return checkk;
    }

    public void setCheckk(String checkk) {
        this.checkk = checkk;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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
        ", checkk=" + checkk +
        ", tel=" + tel +
        ", code=" + code +
        "}";
    }
}

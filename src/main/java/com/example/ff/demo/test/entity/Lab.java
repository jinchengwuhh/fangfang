package com.example.ff.demo.test.entity;

import com.baomidou.mybatisplus.annotation.TableId;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author fangfang
 * @since 2022-03-16
 */
public class Lab implements Serializable {

    private static final long serialVersionUID = 1L;
    @TableId

    private String labId;

    private String labName;

    private String state;

    private String place;

    private String info;

    private String time;


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

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Lab{" +
        "labId=" + labId +
        ", labName=" + labName +
        ", state=" + state +
        ", place=" + place +
        ", info=" + info +
        ", time=" + time +
        "}";
    }
}

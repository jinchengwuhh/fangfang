package com.example.ff.demo.test.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author fangfang
 * @since 2022-02-19
 */
@TableName("reserved_lab")
public class ReservedLab implements Serializable {

    private static final long serialVersionUID = 1L;

    private String revlabId;

    private String labName;

    private String startTime;

    private String endTime;

    private String usefor;

    private String mobile;

    private String info;


    public String getRevlabId() {
        return revlabId;
    }

    public void setRevlabId(String revlabId) {
        this.revlabId = revlabId;
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

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "ReservedLab{" +
        "revlabId=" + revlabId +
        ", labName=" + labName +
        ", startTime=" + startTime +
        ", endTime=" + endTime +
        ", usefor=" + usefor +
        ", mobile=" + mobile +
        ", info=" + info +
        "}";
    }
}

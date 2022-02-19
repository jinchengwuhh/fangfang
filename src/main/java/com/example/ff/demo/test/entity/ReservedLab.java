package com.example.ff.demo.test.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author fangfang
 * @since 2022-01-30
 */
@TableName("reserved_lab")
public class ReservedLab implements Serializable {

    private static final long serialVersionUID = 1L;

    private String revLabId;

    private String lab_name;

    private String start_time;

    private String end_time;

    private String usefor;

    private String mobile;


    public String getRevLabId() {
        return revLabId;
    }

    public void setRevLabId(String revLabId) {
        this.revLabId = revLabId;
    }

    public String getLab_name() {
        return lab_name;
    }

    public void setLab_name(String lab_name) {
        this.lab_name = lab_name;
    }

    public String getStart_time() {
        return start_time;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    public String getEnd_time() {
        return end_time;
    }

    public void setEnd_time(String end_time) {
        this.end_time = end_time;
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

    @Override
    public String toString() {
        return "ReservedLab{" +
        "revLabId=" + revLabId +
        ", lab_name=" + lab_name +
        ", startTime=" + start_time +
        ", endTime=" + end_time +
        ", usefor=" + usefor +
        ", mobile=" + mobile +
        "}";
    }
}

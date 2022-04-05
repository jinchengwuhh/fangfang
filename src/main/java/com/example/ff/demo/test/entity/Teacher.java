package com.example.ff.demo.test.entity;

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
public class Teacher implements Serializable {

    private static final long serialVersionUID = 1L;
    @TableId
    private String tId;

    private String tName;

    private String tPassword;

    private String tAcademy;

    private String tTel;


    public String gettId() {
        return tId;
    }

    public void settId(String tId) {
        this.tId = tId;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }

    public String gettPassword() {
        return tPassword;
    }

    public void settPassword(String tPassword) {
        this.tPassword = tPassword;
    }

    public String gettAcademy() {
        return tAcademy;
    }

    public void settAcademy(String tAcademy) {
        this.tAcademy = tAcademy;
    }

    public String gettTel() {
        return tTel;
    }

    public void settTel(String tTel) {
        this.tTel = tTel;
    }

    @Override
    public String toString() {
        return "Teacher{" +
        "tId=" + tId +
        ", tName=" + tName +
        ", tPassword=" + tPassword +
        ", tAcademy=" + tAcademy +
        ", tTel=" + tTel +
        "}";
    }
}

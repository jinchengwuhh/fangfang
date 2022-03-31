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
public class Student implements Serializable {

    private static final long serialVersionUID = 1L;
    @TableId
    private String sId;

    private String sName;

    private String sPassword;

    private String sex;

    private String sAcademy;

    private String major;

    private String clazzId;

    private String clazz;

    private String credit;

    private String sTel;


    public String getsId() {
        return sId;
    }

    public void setsId(String sId) {
        this.sId = sId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getsPassword() {
        return sPassword;
    }

    public void setsPassword(String sPassword) {
        this.sPassword = sPassword;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getsAcademy() {
        return sAcademy;
    }

    public void setsAcademy(String sAcademy) {
        this.sAcademy = sAcademy;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getClazzId() {
        return clazzId;
    }

    public void setClazzId(String clazzId) {
        this.clazzId = clazzId;
    }

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    public String getCredit() {
        return credit;
    }

    public void setCredit(String credit) {
        this.credit = credit;
    }

    public String getsTel() {
        return sTel;
    }

    public void setsTel(String sTel) {
        this.sTel = sTel;
    }

    @Override
    public String toString() {
        return "Student{" +
        "sId=" + sId +
        ", sName=" + sName +
        ", sPassword=" + sPassword +
        ", sex=" + sex +
        ", sAcademy=" + sAcademy +
        ", major=" + major +
        ", clazzId=" + clazzId +
        ", clazz=" + clazz +
        ", credit=" + credit +
        ", sTel=" + sTel +
        "}";
    }
}

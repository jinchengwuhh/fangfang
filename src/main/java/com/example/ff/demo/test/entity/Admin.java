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
public class Admin implements Serializable {

    private static final long serialVersionUID = 1L;

    private String aId;

    private String aName;

    private String aPassword;

    private String aTel;


    public String getaId() {
        return aId;
    }

    public void setaId(String aId) {
        this.aId = aId;
    }

    public String getaName() {
        return aName;
    }

    public void setaName(String aName) {
        this.aName = aName;
    }

    public String getaPassword() {
        return aPassword;
    }

    public void setaPassword(String aPassword) {
        this.aPassword = aPassword;
    }

    public String getaTel() {
        return aTel;
    }

    public void setaTel(String aTel) {
        this.aTel = aTel;
    }

    @Override
    public String toString() {
        return "Admin{" +
        "aId=" + aId +
        ", aName=" + aName +
        ", aPassword=" + aPassword +
        ", aTel=" + aTel +
        "}";
    }
}

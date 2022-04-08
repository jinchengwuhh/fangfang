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
public class Notice implements Serializable {

    private static final long serialVersionUID = 1L;
    @TableId
    private Integer nId;

    private String title;

    private String text;

    private String style;

    private String nTime;


    public Integer getnId() {
        return nId;
    }

    public void setnId(Integer nId) {
        this.nId = nId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getnTime() {
        return nTime;
    }

    public void setnTime(String nTime) {
        this.nTime = nTime;
    }


    @Override
    public String toString() {
        return "Notice{" +
        "nId=" + nId +
        ", title=" + title +
        ", text=" + text +
        ", style=" + style +
        ", nTime=" + nTime +
        "}";
    }
}

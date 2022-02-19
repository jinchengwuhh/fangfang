package com.example.ff.demo.test;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ResultCode {
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    //响应码
    private int code;
}

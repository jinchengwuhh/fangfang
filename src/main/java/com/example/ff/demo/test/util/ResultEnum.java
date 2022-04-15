package com.example.ff.demo.test.util;

public enum ResultEnum {
    //这里是可以自己定义的，方便与前端交互即可
/*    UNKNOWN_ERROR(-1,"未知错误"),
    SUCCESS(0,"成功"),
    USER_NOT_EXIST(1,"用户不存在"),
    USER_IS_EXISTS(2,"用户已存在"),
    DATA_IS_NULL(3,"数据为空"),
    DENG_1(999,"发送人为空1111"),// 测试
    ;*/
;
    private String token;
    private String msg;


    ResultEnum(String token, String msg) {
        this.token = token;
        this.msg = msg;
    }

    public String getToken() {
        return token;
    }

    public String getMsg() {
        return msg;
    }
}

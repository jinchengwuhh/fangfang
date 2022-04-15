package com.example.ff.demo.test.util;

public class Result<T> {
    private String token;
    private String msg;
    private T result;

    public Result() {
        super();
    }

    public Result(String token, String msg, T result) {
        this.token = token;
        this.msg = msg;
        this.result = result;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "Result{" +
                "token=" + token +
                ", msg='" + msg + '\'' +
                ", result=" + result +
                '}';
    }
}
package com.ywy.controller.result;

public class R<T> {

    private T result;
    private Integer status;
    private Integer code;
    private String message;
    private final Long timestamp = System.currentTimeMillis();

    public R(T result, Integer status, Integer code, String message) {
        this.result = result;
        this.status = status;
        this.code = code;
        this.message = message;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }
}

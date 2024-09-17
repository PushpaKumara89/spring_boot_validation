package com.alibou.exeption.exception;

public class BusinessException extends RuntimeException {
    public String msg;
    public BusinessException(String msg) {
        super(msg);
        this.msg = msg;
    }
}

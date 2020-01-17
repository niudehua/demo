package com.example.demo.exception;

/**
 * @author: deng
 * @date: 2020/1/10
 * @time: 10:58
 * @desc： 自定义异常
 */
public class ResourceNotFoundException extends RuntimeException {
    private String message;

    public ResourceNotFoundException() {
    }

    public ResourceNotFoundException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}

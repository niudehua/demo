package com.example.demo.exception2;

import org.springframework.http.HttpStatus;

/**
 * @author: deng
 * @date: 2020/1/13
 * @time: 15:28
 * @desc：
 */
public enum ErrorCode {
    /**
     * 未找到该资源
     */
    RESOURCE_NOT_FOUND(1001, HttpStatus.NOT_FOUND, "未找到该资源"),
    /**
     * 请求数据格式验证失败
     */
    REQUEST_VALIDATION_FAILED(1002, HttpStatus.BAD_REQUEST, "请求数据格式验证失败"),

    /**
     * 未找到GirlFriend
     */
    GIRLFRIEND_NOT_FOUND(1003, HttpStatus.NETWORK_AUTHENTICATION_REQUIRED, "未找到GirlFriend");
    private final int code;

    private final HttpStatus status;

    private final String message;

    ErrorCode(int code, HttpStatus status, String message) {
        this.code = code;
        this.status = status;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "ErrorCode{" +
                "code=" + code +
                ", status=" + status +
                ", message='" + message + '\'' +
                '}';
    }
}

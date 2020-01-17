package com.example.demo.exception2;

import org.springframework.util.ObjectUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: deng
 * @date: 2020/1/13
 * @time: 15:27
 * @desc：
 */
public abstract class BaseException extends RuntimeException {
    private final ErrorCode errorCode;
    private final HashMap<String, Object> data = new HashMap<>();

    protected BaseException(ErrorCode errorCode, Map<String, Object> data) {
        this.errorCode = errorCode;
        if (!ObjectUtils.isEmpty(data)) {
            this.data.putAll(data);
        }
    }
//    protected BaseException(ErrorCode errorCode, Map<String, Object> data, Throwable cause) {
//        this.errorCode = errorCode;
//        if (!ObjectUtils.isEmpty(data)) {
//            this.data.putAll(data);
//        }
//    }

    public ErrorCode getErrorCode() {
        return errorCode;
    }

    public Map<String, Object> getData() {
        return data;
    }
}

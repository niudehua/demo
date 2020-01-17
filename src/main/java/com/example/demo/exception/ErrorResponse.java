package com.example.demo.exception;

import lombok.Getter;
import lombok.Setter;

/**
 * @author: deng
 * @date: 2020/1/10
 * @time: 10:53
 * @desc：异常信息实体类
 */
@Setter
@Getter
public class ErrorResponse {
    private String message;
    private String errorTypeName;

    public ErrorResponse(Exception e) {
        this(e.getMessage(), e.getClass().getName());

    }

    public ErrorResponse(String message, String errorTypeName) {
        this.message = message;
        this.errorTypeName = errorTypeName;
    }
}

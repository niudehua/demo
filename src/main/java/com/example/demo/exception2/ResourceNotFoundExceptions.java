package com.example.demo.exception2;

import com.google.common.collect.ImmutableMap;

import java.util.Map;

/**
 * @author: deng
 * @date: 2020/1/13
 * @time: 16:10
 * @desc：
 */
public class ResourceNotFoundExceptions extends BaseException {
    public ResourceNotFoundExceptions(Map<String, Object> data) {
        super(ErrorCode.RESOURCE_NOT_FOUND, data);
    }
}

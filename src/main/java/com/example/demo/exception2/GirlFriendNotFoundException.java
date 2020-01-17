package com.example.demo.exception2;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.Map;

/**
 * @author: deng
 * @date: 2020/1/13
 * @time: 11:18
 * @desc：
 */

public class GirlFriendNotFoundException extends BaseException {
    public GirlFriendNotFoundException(Map<String, Object> data) {
        super(ErrorCode.GIRLFRIEND_NOT_FOUND, data);
    }
}

package com.example.demo.exception2;

import com.example.demo.exception.ResourceNotFoundException;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.util.ObjectUtils;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * @author: deng
 * @date: 2020/1/13
 * @time: 15:41
 * @desc：
 */
@Setter
@Getter
@ToString
public class ErrorReponse {
    private int code;
    private int status;
    private String message;
    private String path;
    private LocalDateTime timestamp;
    private HashMap<String, Object> data = new HashMap<>();

    public ErrorReponse(BaseException ex, String path) {
        this(ex.getErrorCode().getCode(), ex.getErrorCode().getStatus().value(), ex.getErrorCode().getMessage(), path, ex.getData());
    }

    public ErrorReponse(int code, int status, String message, String path, Map<String, Object> data) {
        this.code = code;
        this.status = status;
        this.message = message;
        this.path = path;
        this.timestamp = LocalDateTime.now();
        if (!ObjectUtils.isEmpty(data)) {
            this.data.putAll(data);
        }
    }



}

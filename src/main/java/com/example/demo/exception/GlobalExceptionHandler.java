package com.example.demo.exception;

import com.example.demo.controller.ExceptionController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.concurrent.TimeUnit;

/**
 * @author: deng
 * @date: 2020/1/10
 * @time: 11:01
 * @desc： 全局异常处理
 */
//@ControllerAdvice(assignableTypes = {ExceptionController.class})
@ResponseBody
public class GlobalExceptionHandler {

    ErrorResponse illegalArgumentResponse = new ErrorResponse(new IllegalArgumentException("参数错误!"));
    ErrorResponse resourseNotFoundResponse = new ErrorResponse(new ResourceNotFoundException("Sorry, the resourse not found!"));
//    ErrorResponse girlFriendNotFoundResponse = new ErrorResponse(new GirlFriendNotFoundException("Sorry,the girlFriend not found"));

    @ExceptionHandler(value = Exception.class)// 拦截所有异常
    public ResponseEntity<ErrorResponse> exceptionHandler(Exception e) {

        if (e instanceof IllegalArgumentException) {
            return ResponseEntity.status(400).body(illegalArgumentResponse);
        } else if (e instanceof ResourceNotFoundException) {
            return ResponseEntity.status(404).body(resourseNotFoundResponse);
        }
//        else if (e instanceof GirlFriendNotFoundException) {
////            return ResponseEntity.status(404).body(girlFriendNotFoundResponse);
////        }
        return null;
    }



}

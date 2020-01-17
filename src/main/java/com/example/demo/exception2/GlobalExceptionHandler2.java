package com.example.demo.exception2;

import com.example.demo.controller.ExceptionController;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @author: deng
 * @date: 2020/1/13
 * @time: 15:47
 * @desc：
 */
@ControllerAdvice(assignableTypes = {ExceptionController.class})
@ResponseBody
public class GlobalExceptionHandler2 {
    @ExceptionHandler(BaseException.class)
    public ResponseEntity<?> handleAppException(BaseException ex, HttpServletRequest request) {
        ErrorReponse representation = new ErrorReponse(ex, request.getRequestURI());
        return new ResponseEntity<>(representation, new HttpHeaders(), ex.getErrorCode().getStatus());
    }

    @ExceptionHandler(value = ResourceNotFoundExceptions.class)
    public ResponseEntity<ErrorReponse> handleResourceNotFoundExceptions (ResourceNotFoundExceptions ex, HttpServletRequest request) {
        ErrorReponse errorReponse = new ErrorReponse(ex, request.getRequestURI());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorReponse);
    }

    @ExceptionHandler(value = GirlFriendNotFoundException.class)
    public ResponseEntity<ErrorReponse> handleGirlFriendNotFoundException (GirlFriendNotFoundException ex, HttpServletRequest request) {
        ErrorReponse errorReponse = new ErrorReponse(ex, request.getRequestURI());
        return ResponseEntity.status(HttpStatus.NETWORK_AUTHENTICATION_REQUIRED).body(errorReponse);
    }
}

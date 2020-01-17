package com.example.demo.controller;

import com.example.demo.entity.Book;
import com.example.demo.entity.Girl;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.exception2.GirlFriendNotFoundException;
import com.example.demo.exception2.ResourceNotFoundExceptions;
import com.google.common.collect.ImmutableMap;
import org.checkerframework.checker.units.qual.K;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: deng
 * @date: 2020/1/10
 * @time: 11:05
 * @desc： controller模拟抛出异常
 */
@RestController
@RequestMapping("/api")
public class ExceptionController {

    @GetMapping("/illegalArgumentException")
    public void throwException() {
        throw new IllegalArgumentException();
    }

    @GetMapping("/resourceNotFoundException")
    public void throwException2() {
        throw new ResourceNotFoundException();
    }


    @GetMapping("/girlFriendNotFoundException2")
    public void throwException3() {
        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Sorry, the girlFriend not found!", new ResourceNotFoundException());
    }

    @GetMapping("/resourceNotFound")
    public void throwException4() {
        Book book = new Book("bookException", "this is bookException");
        throw new ResourceNotFoundExceptions(ImmutableMap.of("book name:", book.getName()));
    }

    @GetMapping("/gfNotFound")
    public void throwException5() {
        Girl girl = new Girl("xieling");
        throw new GirlFriendNotFoundException(ImmutableMap.of("girl name:",girl.getName()));
//        Map<String, Object> map = new HashMap<>();
//        map.put("girl name:", girl.getName());
//        throw new GirlFriendNotFoundException(map);
    }

    @GetMapping("/foundTooManyGirlFriend")
    public void throwException6() {
        Girl girl1 = new Girl("林允儿");
        Girl girl2 = new Girl("迪丽热巴");
        Girl girl3 = new Girl("花泽香菜");
        Girl girl4 = new Girl("杨超越");

        throw new GirlFriendNotFoundException(ImmutableMap.of("girl1", girl1,"girl2", girl2,"girl3", girl3,"girl4", girl4));
    }
}
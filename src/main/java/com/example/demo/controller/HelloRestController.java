package com.example.demo.controller;

import com.example.demo.entity.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: deng
 * @date: 2020/1/10
 * @time: 10:29
 * @desc： RestController
 */
@RestController
public class HelloRestController {


    @GetMapping("/helloRest")
    public Book helloRest(@RequestBody Book book) {
        return book;
    }
}

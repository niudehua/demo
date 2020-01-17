package com.example.demo.controller;

import com.example.demo.entity.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author: deng
 * @date: 2020/1/10
 * @time: 10:18
 * @desc： thymeleaf @ResponseBody
 */
@Controller
public class HelloController {

    @GetMapping("/hello")
    public String hello(@RequestParam(name = "name", required = false, defaultValue = "niudehua") String name, Model model) {
        model.addAttribute("name", name);

        return "hello";
    }

    @GetMapping("/helloJson")
    @ResponseBody
    public Book helloJson(@RequestBody Book book) {
        return book;
    }

}

package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

/**
 * @author: deng
 * @date: 2020/1/9
 * @time: 14:46
 * @desc：
 */
@Data
@AllArgsConstructor
public class Book {
    private String name;
    private String description;
}

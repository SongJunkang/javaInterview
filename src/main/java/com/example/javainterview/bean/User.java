package com.example.javainterview.bean;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * @author joakims
 * @create 2022-09-12-22:56
 **/
@Data
@Component
public class User {

    private Integer id;
    private String name;
    private String gender;

    public void dowork(){

        System.out.println("do work");
    }




}

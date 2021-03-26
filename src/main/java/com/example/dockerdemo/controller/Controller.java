package com.example.dockerdemo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class Controller {

    @GetMapping("api/hello")
    public String greeting(){
       return "Hello, World!";
    }

    @GetMapping("api/hola")
    public String saludo(){
        return("Hello, World");
    }

    @GetMapping("api/fecha")
    public LocalDate fecha(){
        return LocalDate.now();
    }

}

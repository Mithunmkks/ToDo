package com.example.ToDo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyClass {
    @GetMapping("Hello")
    public String SayHello(){
        return "Hello World";
    }
}

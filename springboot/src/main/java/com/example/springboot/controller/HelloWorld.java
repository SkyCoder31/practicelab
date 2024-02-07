package com.example.springboot.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.entity.HelloWorldBean;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;









@RestController

public class HelloWorld {
    @GetMapping("/hello")
    public String hello(){
        return "Welcome...";
    }

    @GetMapping("/helloworldBean")
    public HelloWorldBean helloWorldBean() {
        return new HelloWorldBean("Hello World");
    }

    @GetMapping("Hello-World/{name}/{a}/{b}")
    public HelloWorldBean helloPathVariable(@PathVariable String name, @PathVariable int a, @PathVariable int b) {
        return new HelloWorldBean(String.format("Hello World, %s,%d", name, a+b));
    }

    @GetMapping("Hello-World/{a}/{b}")
    public int getMethodName(@PathVariable int a,@PathVariable int b) {
        return a+b;
    }
    
    
    

}

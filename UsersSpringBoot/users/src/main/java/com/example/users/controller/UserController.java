package com.example.users.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.users.entity.User;
import com.example.users.service.UserService;




@RestController
public class UserController {
    @Autowired
    private UserService service;
    
    @GetMapping("/users")
    public List<User> retrieveAllUsers(){
        return service.findAll();
    }
    
    @GetMapping("/users/{id}")
    public User retrieveUser(@PathVariable int id) {
        return service.findOne(id);
    }
    
    @PostMapping("/users")
    public void addUser(@RequestBody User user) {
        User savedUser= service.save(user);

    }

    @DeleteMapping("/users/{id}")
    public User deleteById(@PathVariable int id){ //throws Exception{
        // User user=service.deleteById(id);
        // if(user==null)
        return service.deleteById(id);
    }
    



  
    
}

package com.example.association.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.association.entity.Passport;
import com.example.association.service.PassportService;

@RestController
@RequestMapping("/api/passports")
public class PassportController {
    
    @Autowired 
    private PassportService passportService;

    @GetMapping
    public List<Passport> getAllPassport(){
        return passportService.getAllPassport();
    }

    @GetMapping("/{id}")
    public Optional<Passport> getPassportById(@PathVariable Long id){
        return passportService.getPassportById(id);
    }

    @PostMapping
    public Passport savePassport(@RequestBody Passport passport){
        return passportService.savePassport(passport);
    }

    @DeleteMapping("/{id}")
    public void deletePassport(@PathVariable Long id){
        passportService.deletePassport(id);
    }

}

package com.example.manytoonebidirectional.controller;

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

import com.example.manytoonebidirectional.entity.Address;
import com.example.manytoonebidirectional.service.AddressService;

@RestController
@RequestMapping("/api/address")
public class AddressController {
    
    @Autowired
    private AddressService addressService;

    @GetMapping   
    public List<Address> getAllAddresses(){
        return addressService.getAllAddresses();
    }


    @GetMapping("/{id}")
    public Optional<Address> getAddressById(@PathVariable Long id){
        return addressService.getAddressById(id);
    }


    @PostMapping
    public  Address saveAddress(@RequestBody Address address){
        return addressService.saveAddress(address);
    }


    @DeleteMapping("/{id}")
    public void deleteAddress(@PathVariable Long id){
        addressService.deleteAddress(id);
    }

}

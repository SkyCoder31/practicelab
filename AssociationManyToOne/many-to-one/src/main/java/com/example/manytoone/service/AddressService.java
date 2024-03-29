package com.example.manytoone.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.manytoone.entity.Address;
import com.example.manytoone.entity.Employee;
import com.example.manytoone.repository.AddressRepository;

@Service
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;

    public List<Address> getAllAddresses(){
        return addressRepository.findAll();
    }
    
    public Optional<Address> getAddressById(Long id){
        return addressRepository.findById(id);
    }

    public Address saveAddress(Address address){
        return addressRepository.save(address);
    }

    public void deleteAddress(Long id){
        addressRepository.deleteById(id);
    }
}

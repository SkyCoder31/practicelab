package com.example.manytoonebidirectional.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.manytoonebidirectional.entity.Address;
import com.example.manytoonebidirectional.entity.Employee;
import com.example.manytoonebidirectional.repository.AddressRepository;
import com.example.manytoonebidirectional.repository.EmployeeRepository;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired 
    private AddressRepository addressRepository;

    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }

    public Optional<Employee> getEmployeeById(Long id){
        return employeeRepository.findById(id);
    }

    public Employee saveEmployee(Employee employee){
        return employeeRepository.save(employee);
    }

    public void deleteEmployee(Long id){
        employeeRepository.deleteById(id);
    }

    public Address addExisting(Address address){
        address.setEmployee(employeeRepository.findById(address.getEmployee().getId()).get());
        return addressRepository.save(address);
    }
}

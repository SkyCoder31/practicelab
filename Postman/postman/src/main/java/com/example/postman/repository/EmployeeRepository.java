package com.example.postman.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.postman.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long>{

    
}
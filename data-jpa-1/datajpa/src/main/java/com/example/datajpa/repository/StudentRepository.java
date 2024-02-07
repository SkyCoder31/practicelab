package com.example.datajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.datajpa.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Long> {
    
}

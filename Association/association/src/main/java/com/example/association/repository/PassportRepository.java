package com.example.association.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.association.entity.Passport;
@Repository
public interface PassportRepository extends JpaRepository<Passport,Long>{
    
}

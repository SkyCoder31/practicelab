package com.example.association.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.association.entity.Person;
@Repository
public interface PersonRepository extends JpaRepository<Person,Long>{
    
}

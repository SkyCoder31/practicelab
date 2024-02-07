package com.example.manytoonebidirectional.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.manytoonebidirectional.entity.Address;
@Repository
public interface AddressRepository extends JpaRepository<Address,Long>{
    
}

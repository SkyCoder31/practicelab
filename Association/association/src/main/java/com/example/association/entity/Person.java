package com.example.association.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Person {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private long id;

private String name;


@OneToOne(cascade= CascadeType.ALL)
@JoinColumn(name ="passport_id",referencedColumnName="id")
private Passport passport;


public Person() {
}


public Person(String name, Passport passport) {
    this.name = name;
    this.passport = passport;
}


public long getId() {
    return id;
}


public void setId(long id) {
    this.id = id;
}


public String getName() {
    return name;
}


public void setName(String name) {
    this.name = name;
}


public Passport getPassport() {
    return passport;
}


public void setPassport(Passport passport) {
    this.passport = passport;
}




    
}


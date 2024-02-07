package com.example.association.entity;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;


@Entity
public class Passport {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;

    // @OneToOne(cascade= CascadeType.MERGE)
    // @JsonIgnore
    // @JoinColumn(name ="person_id",referencedColumnName="id")
    // private Person person;
    private String passportNumber;
    private LocalDate issueDate;
    private String country;
    public Passport() {
    }
    public Passport(long id, String passportNumber, LocalDate issueDate, String country) {
        this.id = id;
        this.passportNumber = passportNumber;
        this.issueDate = issueDate;
        this.country = country;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getPassportNumber() {
        return passportNumber;
    }
    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }
    public LocalDate getIssueDate() {
        return issueDate;
    }
    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    // public Person getPerson() {
    //     return person;
    // }
    // public void setPerson(Person person) {
    //     this.person = person;
    // }
    

    
}

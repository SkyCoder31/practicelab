package com.example.manytoone.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Employee {
    
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private long id;
private String employeeName;
private String email;

// @OneToMany(cascade = CascadeType.ALL)
// private Address address; 

public Employee(String employeeName, String email) {
    this.employeeName = employeeName;
    this.email = email;
}
public long getId() {
    return id;
}
public void setId(long id) {
    this.id = id;
}
public String getEmployeeName() {
    return employeeName;
}
public void setEmployeeName(String employeeName) {
    this.employeeName = employeeName;
}
public String getEmail() {
    return email;
}
public void setEmail(String email) {
    this.email = email;
}
// public Address getAddress() {
//     return address;
// }
// public void setAddress(Address address) {
//     this.address = address;
// }


}

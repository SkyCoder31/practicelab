package com.example.association.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.association.entity.Person;
import com.example.association.repository.PassportRepository;
import com.example.association.repository.PersonRepository;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;
    @Autowired 
    private PassportRepository passportRepository;

    public List<Person> getAllPerson(){
        return personRepository.findAll();
    }

    public Optional<Person> getPersonById(Long id){
        return personRepository.findById(id);
    }

    public Person savePerson(Person person){
        return personRepository.save(person);
    }

    public Optional<Person> updatePerson(Long id, Person updatedPerson){
        return personRepository.findById(id).map(person ->{
            person.setName(updatedPerson.getName());
            person.setPassport(updatedPerson.getPassport());
            return personRepository.save(person);
        });
    }

    public Person saveExistingPassport(Person person){
        Person person1=new Person();
        person1.setName(person.getName());
        person1.setPassport(passportRepository.findById(person.getPassport().getId()).get());

        return personRepository.save(person1);
    }


    public void deletePassport(Long id){
        personRepository.deleteById(id);
    }


    
}

package customer;

import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

/**
 * driverPerson
 */
public class driverPerson {
   public static void main(String[] args) {
    Person person= new Person();
    person.setName("dkke");
    person.setAge(23);
    person.setCountry("jjsnddff");

    System.out.println(person.getName());
    System.out.println(person.getAge());
    System.out.println(person.getCountry());


   }
}
package customer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the customer details");
        System.out.println("enter the name");
        String name=sc.nextLine();
        System.out.println("Enter the email");
        String email=sc.nextLine();
        System.out.println("enter the type");
        String type=sc.nextLine();
        System.out.println("enter the location");
        String location=sc.nextLine();

        System.out.println();
        Customer c=new Customer(name,email,type,location);
        System.out.println(name);
        System.out.println(email);
        System.out.println(type);
        System.out.println(location);
    }
    
}

package customer.staticIllustration;

import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class staticClass {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter Object 1 details:");
     System.out.println("Enter i1");
     int i1=sc.nextInt();
     System.out.println(("Enter i2"));
     int i2=sc.nextInt();
     staticIllustration s=new staticIllustration();
     s.setI1(i1);
     s.setI2(i2);
     s.displayDetails();
     System.out.println("Enter the object 2 details");
     System.out.println("Enter i1");
      i1=sc.nextInt();
     System.out.println(("Enter i2"));
      i2=sc.nextInt();
     staticIllustration s1=new staticIllustration();
     s1.setI1(i1);
     s1.setI2(i2);
     s1.displayDetail();
    
    }
    
}

import java.util.Scanner;
public class addressGet {

    public static void main(String[] args) {
        addressClass address =new addressClass();
        Scanner sc=new Scanner(System.in);
        address.street=sc.nextLine();
        address.city=sc.nextLine();
        address.country=sc.nextLine();
        address.pincode=sc.nextInt();
        sc.close();
        address.displayAddress();
    }
}
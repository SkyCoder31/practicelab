class Insuffxception extends Exception {

    Insuffxception(){}
   public  Insuffxception(String message){
super(message);
   }
}

public class Account{
private static int accno[]={1001,1002,1003,1004};
private static String name[]={"Athaulla", "Niladri","NiladriLost","NiladriNotFound","niladrilostforever"};
private static double balance[]={4456.35, 3355.34,224553,23355.54};


public static void main(String[] args) {
    try{
        System.out.println("ACCNO"+"\t"+"CUSTOMER"+"\t"+"BALANCE");

        for(int i=0;i<5;i++){
            System.out.println(accno[i]+"\t"+name[i]+"\t"+balance[i]);
            if(balance[i]<1000){
                Insuffxception me= new Insuffxception("Balance is less than 1000");
                throw me;
            }
        }

    }
    catch(Exception e){
        System.out.println(e);

    }

}
}

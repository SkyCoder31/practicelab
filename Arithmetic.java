/**
 * Arithmetic
 */
public class Arithmetic {

    static int add(int a,int b){
        return a+b;
    }
    static int add(int a,int b,int c){
        return a+b+c;
    }
}
class testOverloading{
    public static void main(String[] args) {
        //Arithmetic ob1=new Arithmetic();
       // Arithmetic ob2=new Arithmetic();
        System.out.println(Arithmetic.add(11,11));
        System.out.println(Arithmetic.add(11,11,11));
    }
}
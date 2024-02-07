public class Arithmetic1 {
    void sum(int a, int b){
        System.out.println("int arg method invoked");
    }
    void sum(long a,long b){
        System.out.println("long arg method invoked");
    }

    public static void main(String[] args) {
        Arithmetic1 obj= new Arithmetic1();
        obj.sum(2000L,100000);

    }
    
}

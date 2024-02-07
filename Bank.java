abstract class Bank {
    abstract int getROI();
}
class SBI extends Bank{
    int getROI(){
        return 7;
    }
}
    class PNB extends Bank{
    int getROI(){
        return 8;
    }
}

    class Test{
        public static void main(String[] args) {
           //Bank b;
           //b=new SBI():
           //b=new PNB();
           
           
            SBI s=new SBI();  
            PNB p=new PNB();
            System.out.println(s.getROI());
            System.out.println(p.getROI());
        }
    }



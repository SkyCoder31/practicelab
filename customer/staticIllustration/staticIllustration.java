package customer.staticIllustration;
public class staticIllustration {
    private int i1;
    private static int i2;

    public void setI1(int i1){
        this.i1=i1;
    }
    public int getI1(){
        return i1;
    }
    public void setI2(int i2){
        staticIllustration.i2=i2;
    }
    public int getI2(){
        return i2;
    }

    void displayDetails(){
        System.out.println("Object 1 details" +getI1()+ getI2());
    }
    void displayDetail(){
        System.out.println("Object 2 details"+ getI1()+getI2());
    }

    
}
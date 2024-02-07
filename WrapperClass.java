import java.util.ArrayList;


public class WrapperClass {

    public static void main(String[] args) {
        Integer i=23;
        int  a=i;
        Integer C=a;
        ArrayList<Integer>list=new ArrayList<>();
        list.add(24);
        int num=list.get(0);
        System.out.println(num+C);
    }
}
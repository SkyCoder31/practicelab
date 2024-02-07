
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class hashsetArrayList {
    public static void main(String[] args) {
        Set<Integer> a=new HashSet<Integer>();

        a.addAll(Arrays.asList(new Integer[]{1,2,3,4,5}));

        System.out.println(a.contains(4));  

        Set<Integer> c=new HashSet<Integer>();
        c.add(23);
        c.add(34);
        c.add(256);
        c.add(23);

       // a.addAll(c);

       // a.spliterator()

        System.out.println(a);







    }}      

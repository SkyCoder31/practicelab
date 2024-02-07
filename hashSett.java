import java.util.HashSet;
import java.util.Set;

class hashSett{
    public static void main(String[] args) {
        Set<String> set=new HashSet<String>();

        set.add("Java");
        set.add("Niladri");
        set.add("NIladriLost");
        set.add("Niladri");
        set.add("NiladriBal");

        System.out.println(set);
    }
}
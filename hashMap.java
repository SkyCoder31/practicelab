import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class hashMap {
    public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap<Integer,String>();
        map.put(1,"Niladri_Lost");
        map.put(2,"Niladri found in cave");
        map.put(3,"Niladri arrested");
        map.put(4,"Niladri kidnapped");
        map.put(5,null);

        map.put(4,"Niladri crying");

        //map.remove(5);
        Set set=map.entrySet();
        Iterator i1=set.iterator();
        while(i1.hasNext()){
            Map.Entry set1=(Map.Entry)i1.next();

            if(set1.getValue()==null)

            set1.setValue("Sumita");
            System.out.println(set1.getKey()+":"+set1.getValue());

        }

        //Set<Integer> keys=map.keySet();

        ///System.out.println(map);
        //System.out.println(keys);
    }
}

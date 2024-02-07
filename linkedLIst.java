import java.util.LinkedList;
public class linkedLIst {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<Integer>();
        ll.add(4);
        ll.add(19);
        ll.add(9);

        System.out.println(ll);

        ll.set(0,45);
        System.out.println(ll);

        ll.removeLast();

        System.out.println(ll);
        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());

        ll.remove(ll.get(ll.size()-1));
        System.out.println(ll);
    }

  
}

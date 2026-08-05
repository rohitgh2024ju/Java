package CollectionFramework;
import java.util.LinkedList;

public class LinkedListClass {
    public static void main(String[] args) {
        LinkedList<Integer>list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        list.addFirst(5);
        list.addLast(60);

        System.out.println(list);
        
        list.set(2, 35);
        System.out.println(list);

        list.removeFirst();
        list.removeLast();

        System.out.println(list);
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.err.println(list.size());
    }
    
}

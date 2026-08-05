package CollectionFramework;

import java.util.LinkedList;
import java.util.Queue;

public class QueueClass {
    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();

        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.offer(40);

        System.out.println(q);

        System.out.println(q.peek());

        System.out.println(q.poll());

        System.out.println(q);

        System.out.println(q.size());

        System.out.println(q.isEmpty());
    }
}
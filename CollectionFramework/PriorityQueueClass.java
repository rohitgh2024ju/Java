package CollectionFramework;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueClass {
    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        pq.offer(10);
        pq.offer(40);
        pq.offer(20);
        pq.offer(30);
        pq.offer(5);

        System.out.println(pq);

        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}

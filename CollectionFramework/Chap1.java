package CollectionFramework;

import java.util.ArrayList;
// Collection is a way to group similar objects without repetition
// list, set, map, queue

public class Chap1 {

    public static void main(String[] args) {

        ArrayList<Integer>numArray = new ArrayList<>();
        numArray.add(10);
        numArray.add(20);
        numArray.add(30);
        numArray.add(40);
        numArray.add(50);

        System.out.println(numArray);
        numArray.remove(2);
        numArray.set(3, 100);

        System.out.println(numArray);

        for(int num:numArray) {
            System.out.println(num);
        }

    }

}

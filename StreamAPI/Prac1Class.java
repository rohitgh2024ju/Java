package StreamAPI;

import java.util.List;

public class Prac1Class {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1, 2, 3, 4, 5, 6);

        // Filter even numbers and print them
        nums.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);
    }
}
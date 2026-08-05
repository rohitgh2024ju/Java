package StreamAPI;

import java.util.List;

public class prac3Class {
    public static void main(String[] args) {
        List<Integer> nums = List.of(12, 15, 22, 31, 40, 55, 60);

        nums.stream().filter(num -> num % 3 == 0).forEach(System.out::println);
    }
}

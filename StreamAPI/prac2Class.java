package StreamAPI;

import java.util.List;

public class prac2Class {
    public static void main(String[] args) {
        List<String> fruits = List.of("Apple", "Mango", "Banana", "Orange");
        fruits.stream()
                .forEach(n -> System.out.println(n));

        fruits.stream().forEach(System.out::println);

    }
}

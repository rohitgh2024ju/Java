package chap1practice;
import java.util.Scanner;

public class CheckInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Input: ");

        String input = scanner.nextLine();
        try {
            int num = Integer.parseInt(input);
            System.out.println("You have entered: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Invalid Input: " + e);
        }

        scanner.close();
    }
    
}

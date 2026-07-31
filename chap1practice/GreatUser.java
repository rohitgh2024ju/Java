package chap1practice;
import java.util.Scanner;

public class GreatUser {
    public static String great(String a) {
        return "Hello " + a + ", Have a good day!";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your name sir/mam?: ");

        String name = scanner.nextLine();
        String greatUser = great(name);

        System.out.println(greatUser);
        scanner.close();
    }
}

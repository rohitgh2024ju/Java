import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        int[] array = { 10, 3, 5, 6, 3, 5, 6, 8, 3, 8, 3, 1, 6 };
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a index value till you want to access an array: ");
            int idx = scanner.nextInt();

            System.out.println(array[idx]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        scanner.close();
    }

}

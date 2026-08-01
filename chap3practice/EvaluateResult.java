package chap3practice;
import java.util.Scanner;

public class EvaluateResult {
    public static boolean checkResult(int a, int b, int c) {
        if (a < 33 || b < 33 || c<33) {
            return false;
        }
        else if ((a + b + c)/3.0f < 40) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Marks (space in-between): ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        boolean result = checkResult(a, b, c);
        System.out.println(result);

        scanner.close();
    }
}

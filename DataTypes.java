import java.util.Scanner;

public class DataTypes {
    public static int addThreeNum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter your numbers (space in-between) :");
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            int num3 = scanner.nextInt();


            int sum = addThreeNum(num1, num2, num3);
            System.out.println("sum is : " + sum);

            scanner.close();
        }
    }
    
}

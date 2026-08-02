package chap5practice;

public class CalculateSumArray {
    public static int sumArray(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] array = {12, 23, 34, 45, 56, 67, 78, 89, 90};

        System.out.println("Sum of the array elements is: " + sumArray(array));
    }
}

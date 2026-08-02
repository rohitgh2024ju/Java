package chap5practice;

public class FibonacciSeries {
    public static int FibonacciSum(int n) {
        int sum = 0;
        int a = 0, b = 1;
        for (int i = 0; i <= n; i++) {
            sum += a;

            int next = a + b;
            a = b;
            b = next;
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(FibonacciSum(5));
    }

}

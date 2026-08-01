package chap4practice;

public class SumToN {
    public static int sumToNEvenTerms(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += (2 * i);
        }

        return sum;
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.printf("The sum up to %d is: %d.%n", n, sumToNEvenTerms(n));
    }
}

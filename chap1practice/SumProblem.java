package chap1practice;

public class SumProblem {
    public static int sumThree(int a, int b, int c) {
        return a + b + c;
    };

    public static void main(String[] args) {
        int sum = sumThree(10, 20, 30);
        System.out.println("sum is: " + sum);
    };
}

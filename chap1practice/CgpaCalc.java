package chap1practice;

public class CgpaCalc {
    public static float calculateCgpa(int a, int b, int c) {
        return (((a + b + c)/3.0f)/10);
    };

    public static void main(String[] args) {
        float cgpa = calculateCgpa(93, 78, 55);
        System.out.println("cgpa is: "+ cgpa);
    }
}

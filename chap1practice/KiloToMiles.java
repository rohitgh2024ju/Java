package chap1practice;

public class KiloToMiles {
    public static float toMiles(float x) {
        return x/1.6f;
    }

    public static void main(String[] args) {
        System.out.println("In Miles, it is: " + toMiles(5));
    }
}

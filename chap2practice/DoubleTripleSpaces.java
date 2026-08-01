package chap2practice;

public class DoubleTripleSpaces {
    public static boolean isDoubleTripleSpaces(String string) {
        return (string.contains("  "));
    }

    public static void main(String[] args) {
        System.out.println(isDoubleTripleSpaces("my name is Rohit  Saha"));
    }
}

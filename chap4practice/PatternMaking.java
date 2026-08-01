package chap4practice;

public class PatternMaking {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            String pat = "*".repeat(4 - i);
            
            System.out.println(pat);
        }
    }
}

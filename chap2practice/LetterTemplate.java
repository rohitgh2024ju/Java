package chap2practice;
public class LetterTemplate {
    public static String template(String name) {
        return "Dear " + name + ", Thanks a lot!"; 
    }

    public static void main(String[] args) {
        System.out.println(template("Rohit"));
    }
}

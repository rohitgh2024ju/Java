package chap3practice;
public class TypeWebsite {
    public static String checkType(String name) {
        if (name.endsWith(".com")) {
            return "Commercial Website";
        } else if (name.endsWith(".org")) {
            return "Organization Website";
        } else if (name.endsWith(".in")) {
            return "Indian Government Website";
        }

        return "Unknown URL!";
    }
    public static void main(String[] args) {
        String url = "wwww.mygov.in";
        String result = checkType(url);

        System.out.println(result);
    }

}

public class Arrays {
    public static void main(String[] args) {
        int[] numArray = {1, 2, 3, 4, 5, 6}; // declaration + initialization
        // datatype[] arrayName

        for (int i = 0; i < numArray.length; i++) {
            System.out.println(numArray[(numArray.length - 1) - i]);
        }

        

    }
}

package chap5practice;

public class FindInt {
    public static boolean isIntInArray(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isIntInArray(new int[]{10, 20, 30, 40, 50}, 80));
    }
}

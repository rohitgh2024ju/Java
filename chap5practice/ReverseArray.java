package chap5practice;
import java.util.Arrays;

public class ReverseArray {
    public static int[] revArray(int[] arr) {
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(revArray(new int[]{1, 2, 3, 4, 5, 6})));
    }    
}

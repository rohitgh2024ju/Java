package chap5practice;

import java.util.Arrays;

public class AdditionMatrices {
    public static int[][] addMatrices(int[][] a, int[][] b) {
        int[][] newArray = new int[a.length][a[0].length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                newArray[i][j] = a[i][j] + b[i][j];
            }
        }

        return newArray;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(
                addMatrices(
                        new int[][] {
                                { 1, 2, 3 },
                                { 4, 5, 6 }
                        },
                        new int[][] {
                                { 7, 8, 9 },
                                { 10, 11, 12 }
                        })));
    }
}

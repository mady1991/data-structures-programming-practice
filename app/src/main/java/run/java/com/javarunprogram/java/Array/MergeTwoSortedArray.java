package run.java.com.javarunprogram.java.Array;

import java.util.Arrays;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] X = {1, 4, 7, 8, 10};
        int[] Y = {2, 3, 9};
        int[] Z = new int[X.length + Y.length];
        int k = 0;
        int i = 0;
        int j = 0;
        while (i < X.length && j < Y.length) {
            if (X[i] < Y[j]) {
                Z[k] = X[i];
                i++;
            } else if (X[i] > Y[j]) {
                Z[k] = Y[j];
                j++;
            }
            k++;

        }

        System.out.println(Arrays.toString(Z));
    }
}

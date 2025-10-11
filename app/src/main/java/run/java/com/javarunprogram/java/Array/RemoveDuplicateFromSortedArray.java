package run.java.com.javarunprogram.java.Array;

import java.util.Arrays;

public class RemoveDuplicateFromSortedArray {
    public static void main(String[] args) {
        int a[] = {1, 1, 2};
        int count = 0;
        for (int i = 0; i < a.length - 1; i++) {
            if ((a[i] ^ a[i + 1]) == 0) {
                a[i] = -1;
            } else {
                count++;
            }
        }

        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] == -1 && a[i + 1] != -1) {
                int temp = a[i];
                a[i] = a[i + 1];
                a[i + 1] = temp;
            }

        }
        System.out.println(Arrays.toString(a));


    }
}

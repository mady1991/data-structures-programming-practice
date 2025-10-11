package run.java.com.javarunprogram;

import java.util.Arrays;

public class HH {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 0, 0, 0};
        int b[] = {2, 5, 6};
        int m = 3;
        int n = 3;
        int c[] = new int[m + n];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < m && j < n) {
            if (a[i] < b[j]) {
                c[k++] = a[i++];
            } else {
                c[k++] = b[j++];
            }
        }
        while (i < m) {
            c[k++] = a[i++];
        }
        while (j < n) {
            c[k++] = b[j++];
        }

        System.out.println(Arrays.toString(c));

    }

}




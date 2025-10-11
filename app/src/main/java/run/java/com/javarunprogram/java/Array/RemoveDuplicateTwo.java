package run.java.com.javarunprogram.java.Array;

import java.util.Arrays;

public class RemoveDuplicateTwo {
    public static void main(String[] args) {
//        Input: nums = [1,1,1,2,2,3]
//Output: 5, nums = [1,1,2,2,3,_] // Only pair is allowed

        int a[] = {0, 0, 1, 1, 1, 1, 2, 3, 3};
        for (int i = 0; i < a.length - 2; i++) {
            if ((a[i] ^ a[i + 1]) == 0 && (a[i + 1] ^ a[i + 2]) == 0) {
                a[i] = -1;
            }
        }
        System.out.println(Arrays.toString(a));

        for (int i = 0; i < a.length - 2; i++) {
            if (a[i] == -1 && a[i + 1] != -1) {
                int temp = a[i];
                a[i] = a[i + 1];
                a[i + 1] = temp;
            } else if (a[i] == -1 && a[i + 1] == -1) {
                int temp = a[i];
                a[i] = a[i + 2];
                a[i + 2] = temp;

            }
        }

        System.out.println(Arrays.toString(a));

    }
}

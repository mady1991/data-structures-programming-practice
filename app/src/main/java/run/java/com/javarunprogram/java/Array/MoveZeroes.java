package run.java.com.javarunprogram.java.Array;

import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        //Input: nums = [0,1,0,3,12]
        //Output: [1,3,12,0,0]
        //int a[] = {0, 1, 0, 3, 0, 12, 0};
        int a[] = {0};
        int index = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                int temp = a[i];
                a[i] = a[index];
                a[index] = temp;
                index++;
            }
        }
        while (index < a.length) {
            a[index] = 0;
            index++;

        }
        System.out.println(Arrays.toString(a));
    }


}

package run.java.com.javarunprogram.java.Array;

import java.util.Arrays;

public class ReserveArray {
    public static void reverse(int[] array) {

        if (array == null || array.length < 2) {
            return;
        }

        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }

    }

    public static void main(String[] args) {
        int a[] = {1, 3, 6, 8};
        reverse(a);
        System.out.println(Arrays.toString(a));
    }
}

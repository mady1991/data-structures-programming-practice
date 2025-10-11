package run.java.com.javarunprogram.java.Array;

import java.util.Arrays;

public class RemoveElementsFromArray {


    public static void main(String[] args) {
        int a[] = {3, 2, 2, 3};
        int num = 3;
        int count = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == num && (a[i] ^ num) == 0) {
                a[i] = -1;
            } else {
                count++;
            }
        }


        int low = 0;
        int high = a.length - 1;
        while (low < high) {
            if (a[low] == -1 && a[high] != -1) {
                int temp = a[low];
                a[low] = a[high];
                a[high] = temp;
                low++;
                high--;
            } else if (a[high] == -1) {
                high--;
            } else {
                low++;
            }
        }
        System.out.println(Arrays.toString(a));

    }
}

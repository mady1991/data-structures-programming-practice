package run.java.com.javarunprogram.java.Array;

import java.util.Arrays;

public class ZeroOneSeprate {

    public int[] sorting(int a[]) {
        int low = 0;
        int high = a.length - 1;
        for (int k = 0; k < a.length; k++) {
            if (low < high) {
                if (a[low] > a[high]) {
                    int temp = a[low];
                    a[low] = a[high];
                    a[high] = temp;

                }
                low++;
                high--;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int a[] = {1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 0};
        a = new ZeroOneSeprate().sorting(a);

        System.out.print(Arrays.toString(a));


    }

}

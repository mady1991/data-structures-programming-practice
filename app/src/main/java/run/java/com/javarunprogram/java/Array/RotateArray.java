package run.java.com.javarunprogram.java.Array;

import java.util.Arrays;

public class RotateArray {

    public static void main(String[] args) {
        //Input: nums = [1,2,3,4,5,6,7], k = 3
        //Output: [5,6,7,1,2,3,4]

        //Input: nums = [-1,-100,3,99], k = 2
        //Output: [3,99,-1,-100]
        RotateArray ra = new RotateArray();
        int a[] = {1, 2, 3, 4, 5};
        int step = 2;

        step = a.length - 1 - step;
        ra.sort(a, 0, a.length - 1);
        ra.sort(a, 0, step);
        ra.sort(a, step + 1, a.length - 1);


        System.out.println(Arrays.toString(a));
    }

    void sort(int a[], int low, int high) {

        while (low < high) {
            int temp = a[low];
            a[low] = a[high];
            a[high] = temp;
            high--;
            low++;
        }

    }
}

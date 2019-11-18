package run.java.com.javarunprogram.java.Array;

import java.util.Arrays;

public class ThreeWaySorting {

    void swap(int a[], int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    void sorting(int a[], int end) {
        int pivot = 2;
        int mid = 0, start = 0;

        while (mid <= end) {
            if (a[mid] < pivot) {
                swap(a, start, mid);
                start++;
                mid++;
            } else if (a[mid] > pivot) {
                swap(a, mid, end);
                end--;
            } else {
                mid++;
            }

        }

        System.out.println(Arrays.toString(a));


    }


    public static void main(String[] args) {
        int a[] = {1, 2, 2, 1, 3, 2, 1, 3, 2, 1, 3, 2};
        new ThreeWaySorting().sorting(a, a.length - 1);

    }
}

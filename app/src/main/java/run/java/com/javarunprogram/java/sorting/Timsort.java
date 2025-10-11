package run.java.com.javarunprogram.java.sorting;

import java.util.Arrays;

public class Timsort {
    private static final int RUN = 32;

    public static void main(String[] args) {
        int[] arr = {5, 21, 7, 23, 19, 4, 3, 10, 11, 2, 1, 15, 25, 0, 9, 6, 89, 65};
        int n = arr.length;

        System.out.println("Before sorting:" + Arrays.toString(arr));
        timSort(arr, n);
        System.out.println("After sorting:" + Arrays.toString(arr));
    }


    public static void timSort(int[] arr, int n) {
        for (int i = 0; i < n; i += RUN) {
            insertionSort(arr, i, Math.min((i + RUN - 1), (n - 1)));
        }

    }

    private static void insertionSort(int[] arr, int left, int right) {
        for (int i = left + 1; i <= right; i++) {
            int temp = arr[i];
            int j = i - 1;
            while (j >= left && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }

    }
}

package run.java.com.javarunprogram.java.sorting;

import java.util.Arrays;

public class QuickSort {

    int partition(int a[], int low, int high) {

        int pivot = a[high];
        int i = low - 1;
        System.out.println(" i "+i +" pivot "+pivot);
        for (int j = low; j < high; j++) {
            if (a[j] < pivot) {
                i++;
                int temp = a[j];
                a[j] = a[i];
                a[i] = temp;
            }
        }

        int temp = a[i + 1];
        a[i + 1] = a[high];
        a[high] = temp;

        return i + 1;
    }

    void sort(int a[], int low, int high) {
        if (low < high) {
            int pi = partition(a, low, high);
            System.out.println("pi "+pi + Arrays.toString(a));
            sort(a, low, pi - 1);
            sort(a, pi + 1, high);
        }

    }

    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        int a[] = {23, 65, 2, 98, 06, 12, 21, 5, 34, 54};

        quickSort.sort(a, 0, a.length - 1);
       /// System.out.println( Arrays.toString(a));
    }
}

package run.java.com.javarunprogram.java.sorting;

import android.annotation.SuppressLint;

import java.util.Arrays;

public class InsertSort {

    @SuppressLint("NotConstructor")
    public int[] InsertSort(int a[]) {
        for (int i = 1; i < a.length; i++) {
            int elemnt = a[i];
            int index = i - 1;

            while (index >= 0 && a[index] > elemnt) {
                a[index + 1] = a[index];
                index--;
            }
            a[index + 1] = elemnt;
        }

        return a;
    }

    public int[] BubbleSort(int a[]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = temp;
                }
            }
        }

        return a;
    }

    public int[] SelectionSort(int a[]) {
        for (int i = 0; i < a.length - 1; i++) {
            int min_id = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[min_id]) {
                    min_id = j;
                }
            }
            int temp = a[i];
            a[i] = a[min_id];
            a[min_id] = temp;
        }
        return a;
    }

    void printArray(String param, int a[]) {
        System.out.println(param);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        InsertSort insertSort = new InsertSort();

        int a[] = {98, 7, 45, 32, 23, 87, 4, 72, 8};

        insertSort.printArray("", insertSort.InsertSort(a));
    }


}

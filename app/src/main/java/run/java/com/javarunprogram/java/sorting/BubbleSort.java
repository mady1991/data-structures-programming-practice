package run.java.com.javarunprogram.java.sorting;

import java.util.Arrays;

public class BubbleSort {

    int[] sorting(int a[]) {

        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < a.length - i - 1; j++) {

                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;

                }

            }

        }


        return a;

    }

    void printArray(String param, int a[]) {
        System.out.println(param + Arrays.toString(a));


    }

    public static void main(String[] args) {
        int a[] = {23, 45, 2, 12, 23, 44, 65, 78, 89, 233, 321};

        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.printArray("before", a);
        bubbleSort.printArray("after", bubbleSort.sorting(a));
    }
}

package run.java.com.javarunprogram.java.Array;

import java.util.Arrays;

public class RemoveElementsFromArray {

    public void viaRecusion(int a[], int b[], int c, int index, int indexJ) {
        if (index >= a.length) {
            return;
        }
        if (a[index] == c) {
            b[indexJ] = a[++index];
            indexJ++;
            index++;
        } else {
            b[indexJ] = a[index];
            indexJ++;
            index++;
        }
        viaRecusion(a, b, c, index, indexJ);
    }

    public static void main(String[] args) {
        int a[] = {2, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < a.length/2; i++) {
            int temp = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - 1 - i] = temp;
        }

        System.out.println(Arrays.toString(a));
    }
}

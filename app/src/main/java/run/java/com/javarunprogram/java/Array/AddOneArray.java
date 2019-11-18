package run.java.com.javarunprogram.java.Array;

import java.util.Arrays;

public class AddOneArray {

    int[] reverseArray(int a[]) {
        int j = a.length - 1;
        int mid = a.length / 2;
        for (int i = 0; i <= mid; i++) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            j--;
        }
        return a;
    }

    void addOne(int a[]) {

        a = addUntilOne(a);

        System.out.println(Arrays.toString(a));
    }

    private int[] addUntilOne(int[] a) {
        int sum = 0;
        int carry = 1;
        for (int i = a.length - 1; i >= 0; i--) {
            sum = a[i] + carry;
            carry = (sum > 9) ? 1 : 0;
            sum = sum % 10;
            a[i] = sum;
            if (i == 0 && sum == 0) {
                int b[] = new int[a.length + 1];
                for (int j = b.length - 1; j > 0; j--) {
                    b[j] = a[j - 1];
                }
                b[i] = carry;
                a = b;
            }

        }
        return a;
    }


    public static void main(String[] args) {
        int a[] = {9, 9, 9, 9};
        new AddOneArray().addOne(a);
    }
}

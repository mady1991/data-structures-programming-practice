package run.java.com.javarunprogram.java.Array;

import java.util.Arrays;

public class PrintPostiveNegativeAlternate {
    static void printAlter(int a[]) {
        Arrays.sort(a);
        int i;
        //System.out.println(Arrays.toString(a));
        for (i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                break;
            }
        }
        int len = i;
        for (int j = 0; j < len; j++) {
            if (a[j] < 0 && a[i] > 0) {
                int temp = a[j];
                a[j] = a[i];
                a[i] = temp;
                if (i < a.length) {
                    i = i + 2;
                    j = j + 1;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }

    public static void main(String[] args) {
        int a[] = {-5, -2, 5, 2, 4, 7, 1, 8, -8};

        int index = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                int t = a[i];
                a[i] = a[index];
                a[index] = t;
                index++;
            }

        }
        System.out.println(Arrays.toString(a));

        for (int i = 0; i < a.length ; i++) {
            if (a[i] < 0 && a[index] > 0) {
                int temp = a[i+1];
                a[i+1] = a[index+1];
                a[index+1] = temp;
                index++;
            }

        }


        System.out.println(Arrays.toString(a));

    }
}

package run.java.com.javarunprogram.java.Array;

import java.util.Arrays;

public class KidWithGreatestNumberOfCandy {
    public static void main(String[] args) {
        int a[] = {-1, 3, 5, 1, 3};
        boolean b[] = new boolean[a.length];
        int max = 0;
        int extra = 3;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > max)
                max = a[i];
        }

        for (int i = 0; i < a.length; i++) {
            b[i] = a[i] + extra >= max;
        }

        System.out.println(Arrays.toString(b));
    }
}

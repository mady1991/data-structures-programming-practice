package run.java.com.javarunprogram.java.Array;

import java.util.Arrays;

public class ProductofArrayExceptSelf {

    public static void main(String[] args) {

        //Input: nums = [1,2,3,4]
        //Output: [24,12,8,6]

        int a[] = {1, 2, 3, 4};
        int b[] = new int[a.length];
        //calculate prefix;
        int prefix = 1;
        for (int i = 0; i < a.length; i++) {
            b[i] = prefix;
            prefix = prefix * a[i];
        }

        //calculate suffix
        int suffix = 1;
        System.out.println(Arrays.toString(b));
        for (int i = a.length - 1; i >= 0; i--) {
            b[i] = b[i] * suffix;
            suffix = suffix * a[i];

        }

        System.out.println(Arrays.toString(b));

    }
}

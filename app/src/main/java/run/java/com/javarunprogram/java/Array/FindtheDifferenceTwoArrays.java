package run.java.com.javarunprogram.java.Array;

import java.util.Arrays;

public class FindtheDifferenceTwoArrays {
    public static void main(String[] args) {
        //Input: nums1 = [1,2,3], nums2 = [2,4,6]
        //Output: [[1,3],[4,6]]

        //Input: nums1 = [1,2,3,3], nums2 = [1,1,2,2]
        //Output: [[3],[]]

//        int a[] = {1, 2, 3};
//        int b[] = {2, 4, 6};
        int a[] = {1, 2, 3, 3};
        int b[] = {1, 1, 2, 2};
        //Output: [[3],[]]

        int i = 0, j = 0;
        while (i < a.length && j < b.length) {
            if (a[i] == b[j]) {
                a[i] = -1;
                b[j] = -1;
                i++;
                j++;
            } else if (a[i] < b[j]) {
                i++;
            } else if (a[i] > b[j]) {
                j++;
            }
        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

    }
}

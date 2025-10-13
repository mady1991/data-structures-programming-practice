package run.java.com.javarunprogram.java.Array;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        //Input: nums = [2,7,11,15], target = 9
        //Output: [0,1]
//        int a[] = {2, 7, 11, 15};
//        int target = 9;
        int a[] = {3, 2, 4};

        int target = 6;

        int low = 0;
        int high = a.length - 1;


        while (low < high) {
            if (a[low] + a[high] == target) {
                System.out.println(low + " " + high);

                low++;
                high--;
            } else if (a[low] + a[high] > target) {
                high--;
            } else {
                low++;
            }
        }
    }
}

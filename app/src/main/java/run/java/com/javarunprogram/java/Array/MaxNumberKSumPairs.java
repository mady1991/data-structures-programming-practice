package run.java.com.javarunprogram.java.Array;

public class MaxNumberKSumPairs {
    public static void main(String[] args) {
        //Input: nums = [1,2,3,4], k = 5
        //Output: 2
        //int a[] = {1, 2, 3, 4};
        int a[] = {3, 1, 3, 4, 3};
        int k = 5;
        int low = 0;
        int high = a.length - 1;
        int pair = 0;
        while (low < high) {
            if ((a[low] ^ a[high]) == 0) {
                low++;
                high--;
            } else if (a[low] + a[high] == k && (a[low] ^ a[high]) != 0) {
                low++;
                high--;
                pair++;
            } else if (a[low] + a[high] < k) {
                low++;
            } else {
                high--;
            }
        }
        System.out.println(pair);
    }
}

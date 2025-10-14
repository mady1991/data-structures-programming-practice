package run.java.com.javarunprogram.java.Array;

import java.util.Arrays;

public class FindPairsToSum {

    void findPair(int a[], int sum) {
        int low = 0;
        int high = a.length - 1;
        while (low < high) {
            if (a[low] + a[high] == sum) {
                System.out.println("pair " + a[low] + " " + a[high]);
                low++;
                high--;
            } else if (a[low] + a[high] < sum) {
                low++;
            } else {
                high--;
            }
        }
    }


    public static void main(String[] args) {
        int a[] = {2, -7, 5, 9, 1, 8, 3, 6};
        int sum = 11;
        Arrays.sort(a);

        new FindPairsToSum().findPair(a, sum);
    }

}

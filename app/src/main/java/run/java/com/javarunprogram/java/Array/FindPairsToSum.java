package run.java.com.javarunprogram.java.Array;

import java.util.Arrays;

public class FindPairsToSum {

    void findPair(int a[], int sum) {
        Arrays.sort(a);
        int low = 0;
        int high = a.length - 1;
        for (int i = 0; i < a.length; i++) {

            if (a[low] + a[high] == sum) {
                System.out.println("pairs are" + a[low] + "," + a[high]);
            }

            if (a[low] + a[high] < sum) {
                low++;
            } else {
                high--;
            }

        }
    }


    public static void main(String[] args) {
        int a[] = {2, -7, -4, 9, 1, 8, 3, 6};
        int sum = 11;
        Arrays.sort(a);
        new FindPairsToSum().findPair(a, sum);
    }

}

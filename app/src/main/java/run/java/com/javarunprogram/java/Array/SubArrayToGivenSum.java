package run.java.com.javarunprogram.java.Array;

import java.util.ArrayList;

public class SubArrayToGivenSum {

   static void findSubArray(int a[], int summ) {
        ArrayList<Integer> sub = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {

            int sum = 0;
            for (int j = i; j < a.length; j++) {
                sum = sum + a[j];
                sub.add(a[j]);

                if (sum == summ) {
                    System.out.println("sub array" + sub + "length-->" + sub.size());
                    sub.clear();

                }

                if (j == a.length - 1) {
                    sub.clear();
                }

            }

        }
    }


    static void printSubarray(int arr[], int givenSum) {
        int currSum = arr[0];
        int start = 0;
        int end = 0;
        while (end < arr.length) {
            if (currSum == givenSum) {
                System.out.println("Found given sum from " + arr[start] + " to " + arr[end]);
            }

            if (currSum <= givenSum) {
                end++;
                if (end < arr.length)
                    currSum = currSum + arr[end];
            } else {
                currSum = currSum - arr[start];
                start++;
            }
        }
    }

    public static void main(String[] args) {
        int[] A = {5, 6, -5, 5, 3, 5, 3, -2, 0};
        int sum = 9;
        printSubarray(A, sum);
        //new SubArrayToGivenSum().findSubArray(A, sum);
    }
}

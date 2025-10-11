package run.java.com.javarunprogram.java.hackerrank;

import java.util.Arrays;
import java.util.List;

public class DivisibleSumPairs {
    public static void main(String[] args) {
        Integer ar[] = {10, 73, 90, 20, 80};

        int n = ar.length, k = 100;
        System.out.println(divisibleSumPairs(n, k, Arrays.asList(ar)));

    }

    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {

        int[] remainderCount = new int[k];

        // Count occurrences of each remainder
        for (int num : ar) {
            remainderCount[num % k]++;
        }
        System.out.println(Arrays.toString(remainderCount));
        int pair = 0;
        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j < n; j++) {

                if ((ar.get(i) + ar.get(j)) % k == 0) {
                    pair++;
                }
            }
        }


        return pair;

    }
}

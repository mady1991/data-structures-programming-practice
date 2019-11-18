package run.java.com.javarunprogram.java.Array;

import java.util.Arrays;

public class FindIntersection {

    private static void findIntersection(int[] firstArr, int[] secondArr) {
        int i = 0;
        int j = 0;
        while (i < firstArr.length && j < secondArr.length) {
            if (firstArr[i] < secondArr[j]) {
                i++;
            } else if (firstArr[i] > secondArr[j]) {
                j++;
            } else {
                System.out.print(firstArr[i] + " ");
                i++;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int a[] = {1, 5, 7, 2, 9, 10, 12};
        int b[] = {2, 6, 4, 11, 10};
        Arrays.sort(a);
        Arrays.sort(b);

        findIntersection(a, b);
    }
}

package run.java.com.javarunprogram.java.Array;

import java.util.Arrays;

public class UniqueNumberOccurrences {
    //Input: arr = [1,2,2,1,1,3]
    //Output: true

    public static void main(String[] args) {
        int arr[] = {-3, 0, 1, -3, 1, 1, 1, -3, 10, 0};

        Arrays.sort(arr);
        int count = 0;
        int previousCount = 0;
        boolean flag = true;
        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] == arr[i + 1]) {
                count++;
            } else {
                if (previousCount == count) {
                    flag = false;
                }
                previousCount = count;
                count = 0;
            }
        }
        System.out.println(flag);


    }
}

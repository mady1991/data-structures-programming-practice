package run.java.com.javarunprogram.java.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SockPair {
    public static void main(String[] args) {

        Integer integerArray[] = {10, 20, 20, 10, 10, 30, 50, 10, 30, 30, 20};//{1, 1, 3, 1, 2, 1, 3, 3, 3, 3};
        //1,1,1,1,2,3,3,3,3,3
        List<Integer> integerList = new ArrayList<>(Arrays.asList(integerArray));
        System.out.println(sockMerchant(integerList.size(), integerList));
    }

    public static int sockMerchant(int n, List<Integer> ar) {
        int sockPair = 0;
        int sockCount = 1;

        Collections.sort(ar);
        for (int i = 0; i < n - 1; i++) {
            if (ar.get(i) == ar.get(i + 1)) {
                sockCount++;
            } else {
                sockPair = sockPair + (sockCount / 2);
                sockCount = 1;
            }
            if (i + 1 == n - 1) {
                sockPair = sockPair + (sockCount / 2);
            }
        }
        return sockPair;
    }
}

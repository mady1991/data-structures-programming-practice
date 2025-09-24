package run.java.com.javarunprogram.java.Array;

import java.util.ArrayList;

public class FindSubArrayEqaulToZero {

    void findSubArray(int a[]) {
        ArrayList<Integer> sub = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            int sum = a[i];
            sub.add(a[i]);
            for (int j = i + 1; j < a.length; j++) {
                sub.add(a[j]);
                sum = sum + a[j];
                if (sum == 0) {
                    System.out.println("sub array" + sub);
                    sub.clear();
                }


            }

        }
    }

    public static void main(String[] args) {
        int[] A = {3, 4, -7, 3, 1, 3, 1, -4, -2, -2};
        new FindSubArrayEqaulToZero().findSubArray(A);
    }
}

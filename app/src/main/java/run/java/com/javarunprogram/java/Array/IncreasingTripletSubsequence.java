package run.java.com.javarunprogram.java.Array;

public class IncreasingTripletSubsequence {

    public static void main(String[] args) {
        //Input: nums = [1,2,3,4,5]
        //Output: true
        //Explanation: Any triplet where i < j < k is valid.

        //int a[] = {1, 2, 3, 4, 5};
        //int a[] = {5, 4, 3, 2, 1};
        int a[] = {2, 1, 5, 0, 4, 6};
        boolean result = false;
        for (int i = 0; i < a.length - 2; i++) {
            if (a[i] < a[i + 1] && a[i + 1] < a[i + 2]) {
                result = true;
                break;
            }

        }
        System.out.println(result);

    }
}

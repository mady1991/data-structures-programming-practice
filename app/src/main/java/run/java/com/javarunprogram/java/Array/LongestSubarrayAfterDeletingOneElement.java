package run.java.com.javarunprogram.java.Array;

public class LongestSubarrayAfterDeletingOneElement {
    public static void main(String[] args) {
        //Input: nums = [1,1,0,1]
        //Output: 3
        //int a[] = {0, 1, 1, 1, 0, 1, 1, 0, 1};
        int a[] = {1, 1, 1};

        int left = 0;
        int k = 1;
        int zero = 0;
        int maxLen = 0;

        for (int right = 0; right < a.length; right++) {
            if (a[right] == 0) zero++;

            while (zero > k) {
                if (a[left] == 0) zero--;
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);

        }
        System.out.println(maxLen - 1);


    }
}

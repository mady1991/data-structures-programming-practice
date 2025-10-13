package run.java.com.javarunprogram.java.Array;

public class MaxConsecutiveOnes {
    //Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
    //Output: 6
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1};
        int k = 3;
        System.out.println(longestOnes(nums, k));
    }

    public static int longestOnes(int[] nums, int k) {
        int left = 0, zeros = 0, maxLen = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) zeros++;

            // If we have more than k zeros, shrink window from left
            while (zeros > k) {
                if (nums[left] == 0) zeros--;
                left++;
            }

            // Update maximum length of valid window
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}

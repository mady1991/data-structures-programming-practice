package run.java.com.javarunprogram.java.Array;

public class HouseRobber {
    //Input: nums = [1,2,3,1]
    //Output: 4

    public static void main(String[] args) {
        int a[] = {2, 7, 9, 3, 1};

        System.out.println(rob(a));
    }


    public static int rob(int[] nums) {
        int prev = 0;
        int curr = 0;

        for (int num : nums) {
            int temp = curr;
            curr = Math.max(curr, prev + num);
            prev = temp;
        }

        return curr;


    }
}

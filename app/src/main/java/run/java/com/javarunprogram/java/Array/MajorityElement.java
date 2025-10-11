package run.java.com.javarunprogram.java.Array;

import java.util.Arrays;
import java.util.HashMap;

public class MajorityElement {

    public static void main(String[] args) {
        //Example 1:
        //
        //Input: nums = [3,2,3]
        //Output: 3
        //Example 2:
        //
        //Input: nums = [2,2,1,1,1,2,2]
        //Output: 2
        HashMap<Integer, Integer> map = new HashMap<>();
        int a[] = {3,2,3};


        for (int i = 0; i < a.length; i++) {

            if (map.containsKey(a[i])) {
                map.put(a[i], map.get(a[i]) + 1);
            } else {
                map.put(a[i], 1);
            }
        }

        int result = 0;
        for (Integer key : map.keySet()) {
            if (map.get(key) >= a.length / 2) {
                result++;
            }

        }


        System.out.println(result);

    }

    public static int majorityElement(int[] nums) {
        int count = 0, candidate = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        return candidate;
    }


}


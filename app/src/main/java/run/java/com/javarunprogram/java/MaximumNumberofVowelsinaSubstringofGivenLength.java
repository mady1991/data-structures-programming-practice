package run.java.com.javarunprogram.java;

import java.util.HashSet;
import java.util.Set;

public class MaximumNumberofVowelsinaSubstringofGivenLength {

    public static void main(String[] args) {
        // Input: s = "abciiidef", k = 3 -> Output: 3
        // Input: s = "aeiou", k = 2 -> Output: 2

        String s = "abciiidef";
        int k = 3;

        System.out.println(maxVowels(s, k));
    }

    private static int maxVowels(String s, int k) {

        String vowels = "aeiouAEIOU";
        int maxCount = 0, currentCount = 0;

        // first window
        for (int i = 0; i < k && i < s.length(); i++) {
            if (vowels.contains(String.valueOf(s.charAt(i))))
                currentCount++;
        }
        maxCount = currentCount;

        // sliding window
        for (int i = k; i < s.length(); i++) {
            if (vowels.contains(String.valueOf(s.charAt(i))))
                currentCount++;
            if (vowels.contains(String.valueOf(s.charAt(i - k))))
                currentCount--;
            maxCount = Math.max(maxCount, currentCount);
        }

        return maxCount;
    }
}

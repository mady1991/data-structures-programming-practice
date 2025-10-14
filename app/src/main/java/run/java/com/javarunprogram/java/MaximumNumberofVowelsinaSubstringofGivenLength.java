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
        int maxCount = 0, vowel = 0;
        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            if (vowels.contains(String.valueOf(s.charAt(right)))) {
                vowel++;
            }

            while (vowel > k) {
                if (vowels.contains(String.valueOf(s.charAt(left))))
                    vowel--;
                left++;
            }

            if (vowel > maxCount)
                maxCount = vowel;

        }
        return maxCount;

    }


}

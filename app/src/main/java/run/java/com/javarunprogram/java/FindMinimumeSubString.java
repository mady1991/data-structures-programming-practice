package run.java.com.javarunprogram.java;

import java.util.Arrays;

public class FindMinimumeSubString {

    final int no_of_chars = 256;

    public String findMinimum(String str, String pat) {
        int len1 = str.length();
        int len2 = pat.length();

        // check if string's length is less than pattern's
        // length. If yes then no such window can exist
        if (len1 < len2) {
            System.out.println("No such window exists");
            return "";
        }

        int hash_pat[] = new int[no_of_chars];
        int hash_str[] = new int[no_of_chars];

        // store occurrence ofs characters of pattern
        for (int i = 0; i < len2; i++)
            hash_pat[pat.charAt(i)]++;

        int start = 0, start_index = -1, min_len = Integer.MAX_VALUE;

        // start traversing the string
        int count = 0; // count of characters
        for (int j = 0; j < len1; j++) {
            // count occurrence of characters of string
            hash_str[str.charAt(j)]++;

            // If string's char matches with pattern's char
            // then increment count
            if (hash_pat[str.charAt(j)] != 0 &&
                    hash_str[str.charAt(j)] <= hash_pat[str.charAt(j)])
                count++;

            // if all the characters are matched
            if (count == len2) {
                // Try to minimize the window i.e., check if
                // any character is occurring more no. of times
                // than its occurrence in pattern, if yes
                // then remove it from starting and also remove
                // the useless characters.
                while (hash_str[str.charAt(start)] > hash_pat[str.charAt(start)]
                        || hash_pat[str.charAt(start)] == 0) {

                    if (hash_str[str.charAt(start)] > hash_pat[str.charAt(start)])
                        hash_str[str.charAt(start)]--;
                    start++;
                }

                // update window size
                int len_window = j - start + 1;
                if (min_len > len_window) {
                    min_len = len_window;
                    start_index = start;
                }
            }
        }

        // If no window found
        if (start_index == -1) {
            System.out.println("No such window exists");
            return "";
        }

        // Return substring starting from start_index
        // and length min_len
        return str.substring(start_index, start_index + min_len);
    }

    //find which element are common and also let you know the both String are anagram are not
    public static void comapreChar(String str, String str2) {
        char str_char[] = str.toCharArray();
        char str_char2[] = str2.toCharArray();
        Arrays.sort(str_char);
        Arrays.sort(str_char2);
        int i = 0;
        int j = 0;
        while (i < str_char.length && j < str_char2.length) {
            if (Character.valueOf(str_char[i]) < Character.valueOf(str_char2[j])) {
                i++;
            } else if (Character.valueOf(str_char[i]) > Character.valueOf(str_char2[j])) {
                j++;
            } else {
                System.out.println(str_char[i]);
                i++;
                j++;
            }
        }


    }

    public static void main(String[] args) {
        FindMinimumeSubString findMinimumeSubString = new FindMinimumeSubString();
        String str = "this is a test string";
        String pat = "a test";

        System.out.print("Smallest window is : " +
                findMinimumeSubString.findMinimum(str, pat));
       // FindMinimumeSubString.comapreChar("Neha", "Narenderh");

    }
}

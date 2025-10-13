package run.java.com.javarunprogram.java;

public class StringIsSubsequence {
    //Input: s = "abc", t = "ahbgdc"
//Output: true
    public static void main(String[] args) {
        //String s = "abc", t = "ahbgdc";
        String s = "axc", t = "ahbgdc";
        int i = 0, j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
                j++;

            } else {
                j++;
            }
        }
        System.out.println(i == s.length());
    }
}

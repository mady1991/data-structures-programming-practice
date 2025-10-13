package run.java.com.javarunprogram.java;

public class RemovingStarsFromString {
    //Input: s = "leet**cod*e"
    //Output: "lecoe"
    public static void main(String[] args) {
        //String s = "leet**cod*e";
        String s = "erase*****";

        int i = 0;
        while (i < s.length()) {
            if (s.charAt(i) == '*') {
                s = s.substring(0, i - 1) + s.substring(i + 1);
                i--;
            }else{
                i++;
            }
        }
        System.out.printf(s);

    }
}

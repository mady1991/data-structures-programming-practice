package run.java.com.javarunprogram.java;

public class ReverseVowelsString {
    public static void main(String[] args) {
        //Input: s = "IceCreAm"
        //Output: "AceCreIm"

        String s = "IceCreAm";

        String vowels = "aeiouAEIOU";

        int low = 0;
        int high = s.length() - 1;

        while (low < high) {
            if (vowels.contains(String.valueOf(s.charAt(low))) && vowels.contains(String.valueOf(s.charAt(high)))) {
                s = s.substring(0, low) + s.charAt(high) + s.substring(low + 1, high) + s.charAt(low) + s.substring(high + 1);
                low++;
                high--;
            } else if (vowels.contains(String.valueOf(s.charAt(low)))) {
                high--;
            } else if (vowels.contains(String.valueOf(s.charAt(high)))) {
                low++;
            } else {
                low++;
                high--;
            }

        }
        System.out.println(s);

    }
}

package run.java.com.javarunprogram.java;

public class MergeStringAlternative {
    public static void main(String[] args) {
        String a = "abc";
        String b = "pqrg";
        String c = "";
        int i = 0, j = 0;

        while (i < a.length() && j < b.length()) {
            c = c + a.charAt(i) + b.charAt(j);
            i++;
            j++;
        }
        //adding rest
        if (i < a.length()) {
            c = c + a.substring(i);
        }
        if (j < b.length()) {
            c = c + b.substring(j);
        }
        System.out.println(c);

    }
}

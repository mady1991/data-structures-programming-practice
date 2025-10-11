package run.java.com.javarunprogram.java;

public class GCDString {
    public static void main(String[] args) {
//        String str1 = "ABABAB";
//        String str2 = "ABAB";
        String str1 = "LEET", str2 = "CODE";
        System.out.println(gcdString(str1, str2));

    }

    public static String gcdString(String a, String b) {
        if (a.length() < b.length()) {
            return gcdString(b, a);
        }
        if (a.equals(b)) {
            return a;
        }
        if (a.substring(0, b.length()).equals(b)) {
            return gcdString(a.substring(b.length()), b);
        }
        return "";

    }
}

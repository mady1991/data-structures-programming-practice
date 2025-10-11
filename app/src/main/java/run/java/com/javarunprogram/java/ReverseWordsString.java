package run.java.com.javarunprogram.java;

public class ReverseWordsString {

    //Input: s = "the sky is blue"
    //Output: "blue is sky the"
    public static void main(String[] args) {

        //String s = "the sky is blue";
        String s = "  hello world  ";
        //String s = "a good   example";
        String a[] = s.split(" ");
        String newString = "";

        for (int i = a.length - 1; i >= 0; i--) {
            if (!a[i].equals("")) {

                if (newString.equals("")) {
                    newString = a[i];
                } else {
                    newString = newString + " " + a[i].trim();
                }
            }
        }

        System.out.println(newString);
    }
}

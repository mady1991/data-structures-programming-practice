package run.java.com.javarunprogram.java;

public class StringCompression {
    //Input: chars = ["a","a","b","b","c","c","c"]
    //Output: Return 6, and the first 6 characters of the input array should be: ["a","2","b","2","c","3"]
    //Explanation: The groups are "aa", "bb", and "ccc". This compresses to "a2b2c3".
    public static void main(String[] args) {
        char a[] = {'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'};
        String compressedString = "";
        int count = 1;
        char letter;

        for (int i = 0; i < a.length - 1; i++) {
            letter = a[i];
            if (a[i] == a[i + 1]) {
                count++;
            } else {
                if (count == 1) {
                    compressedString = compressedString + letter;
                } else {
                    compressedString = compressedString + letter + count;
                }
                count = 1;
            }

        }
        //for Last index
        letter = a[a.length - 1];
        if (count == 1) {
            compressedString = compressedString + letter;
        } else {
            compressedString = compressedString + letter + count;
        }

        System.out.println(compressedString);
    }
}

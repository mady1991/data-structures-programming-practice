package run.java.com.javarunprogram.java.Array;

import java.util.ArrayList;
import java.util.Map;

public class LetterCombinationsofaPhoneNumber {
    //Input: digits = "23"
    //Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]

    public static void main(String[] args) {
        Map<Integer, String> map = Map.of(
                2, "abc",
                3, "def",
                4, "ghi",
                5, "jkl",
                6, "mno",
                7, "pqrs",
                8, "tuv",
                9, "wxyz"
        );
        String digits = "23";
        ArrayList<String> output = new ArrayList<>();

        if (digits.length() >= 1) {
            for (int i = 0; i < digits.length(); i++) {
                int digit = Integer.parseInt(String.valueOf(digits.charAt(i)));
                String letters = map.get(digit);
                if (output.isEmpty()) {
                    for (int j = 0; j < letters.length(); j++) {
                        output.add(String.valueOf(letters.charAt(j)));
                    }
                }else{
                    ArrayList<String> temp = new ArrayList<>();
                    for (String s : output) {
                        for (int j = 0; j < letters.length(); j++) {
                            temp.add(s + letters.charAt(j));
                        }
                    }
                    output = temp;

                }
            }
        }
        System.out.println(output);

    }
}

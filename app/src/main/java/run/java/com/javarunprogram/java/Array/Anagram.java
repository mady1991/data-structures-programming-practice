package run.java.com.javarunprogram.java.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Anagram {

    public List<String> funWithAnagrams(List<String> s) {

        if (s == null || s.size() == 1) {
            return s;
        }
        int i = 0;
        int j = 1;
        Collections.sort(s);
        while (j < s.size()) {
            if (checkAnangram(s.get(i), s.get(j))) {
                s.remove(j);
            } else {
                i++;
                j++;
            }
        }

        return s;
    }


    public boolean checkAnangram(String s, String s1) {
        char[] ss = s.toCharArray();
        char[] ss1 = s1.toCharArray();
        Arrays.sort(ss);
        Arrays.sort(ss1);

        return Arrays.equals(ss, ss1);
    }


    public static void main(String[] args) {

        List<String> s = new ArrayList<>();


        s.add("poke");
        s.add("Rama");
        s.add("opke");
        s.add("maRa");
        s.add("moni");
        s.add("nomi");

        System.out.println(new Anagram().funWithAnagrams(s));

    }


}

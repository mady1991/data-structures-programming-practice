package run.java.com.javarunprogram.java.Array;

import java.util.HashMap;

public class FirstRepeatedElement {

    static void printFirstRepeating(int a[]) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            if (map.containsKey(a[i])) {
                int count = map.get(i);
                map.put(a[i], ++count);
                System.out.println(a[i]);
                break;
            } else {
                map.put(a[i], 1);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {10, 5, 3, 4, 5, 3, 6};
        printFirstRepeating(arr);
    }
}

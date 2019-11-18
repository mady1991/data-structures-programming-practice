package run.java.com.javarunprogram.java.Array;

import java.util.HashMap;
import java.util.Map;

public class XTimesOccurence {


    public void withSpace(int a[]) {
        Map<Integer, Integer> frequency = new HashMap<>();

        for (int i : a) {
            if (frequency.containsKey(i)) {
                frequency.replace(i, frequency.get(i) + i);
            } else {
                frequency.put(i, i);
            }
        }

        System.out.println("Number need to be deleted : ");
        for (Map.Entry<Integer, Integer> map : frequency.entrySet()) {
            int key = map.getKey();
            int value = map.getValue();
            if (value / key != key) {
                System.out.print(key + " ");
            }

        }

    }

    public static void main(String[] args) {
        int a[] = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5};
        new XTimesOccurence().withSpace(a);


    }
}

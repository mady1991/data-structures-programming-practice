package run.java.com.javarunprogram.java.hackerrank;

import java.util.Arrays;
import java.util.List;

public class MigratoryBirds {
    public static void main(String[] args) {
        //int ar[] = {1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4};
        Integer ar[] = {1, 4, 4, 4, 5, 3};
        System.out.println(migratoryBirds(Arrays.asList(ar)));
    }

    static int migratoryBirds(List<Integer> ar) {
        int counter[] = new int[6];
        int result = 1; int max = 0;
        for (int i = 0; i < ar.size(); i++) {
            counter[ar.get(i)]++;
        }

        for (int i = 1; i <= 5; i++) {
            if (counter[i] > max) {
                result = i;
                max = counter[i];
            }
        }

        return result;
    }
}

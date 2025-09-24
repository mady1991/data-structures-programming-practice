package run.java.com.javarunprogram.java;

import java.util.Arrays;
import java.util.Random;

public class MahzoozProgram {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getRandomNumber(4, 1, 20)));
    }

    public static int[] getRandomNumber(int tillValues, int minValues, int maxValues) {
        int array[] = new int[tillValues];
        for (int i = 0; i < tillValues; i++) {
            array[i] = getRandomNumbersUsingNextInt(minValues, maxValues);
        }


        return array;
    }

    private static int getRandomNumbersUsingNextInt(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min) + min;

    }
}



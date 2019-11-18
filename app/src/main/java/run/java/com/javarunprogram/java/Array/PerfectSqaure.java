package run.java.com.javarunprogram.java.Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class PerfectSqaure {


    boolean squre(int a, int b) {
        int sum = a + b;
        int mid = sum / 2;
        for (int i = 2; i <= mid; i++) {
            int square = i * i;
            if (square == sum) {
                return true;
            }

        }


        return false;
    }

    public void perfectSquarePairs(Integer a[]) {
        HashSet<Integer> set = new HashSet<>(Arrays.asList(a));
        System.out.println("suare are :");
        for (int i = 0; i < a.length; i++) {

            for (int k = i + 1; k < a.length; k++) {
                if (squre(a[i], a[k])) {
                    System.out.println(" " + a[i] + "," + a[k]);
                }
            }

        }


    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s=scan.next();
        double d=scan.nextDouble();
        Integer i = scan.nextInt();


        // Write your code here.

        System.out.println("String: " + "Welcome to HackerRank's Java tutorials!");
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);


    }
}

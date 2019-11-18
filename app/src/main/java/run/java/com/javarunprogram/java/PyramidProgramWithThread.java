package run.java.com.javarunprogram.java;

import java.util.Scanner;

public class PyramidProgramWithThread implements Runnable {


    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the no of row which you want to print");
        int row = scanner.nextInt();

        for (int i = 0; i < row; i++) {

            for (int space = row - i; space > 0; space--)
                System.out.print(" ");


            for (int j = 0; j < (2 * i) + 1; j++) {
                System.out.printf("*");
            }
            System.out.println();

            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public static void main(String[] args) {
        new PyramidProgramWithThread().run();


    }
}

package run.java.com.javarunprogram.java.sorting;

import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try {
                long x = sc.nextLong();
                System.out.println(x + " can be fitted in:");
                if (x >= -128 && x <= 127)
                    System.out.println("* byte");
                if (x >= -(long)Math.pow(2, 15) && x <= ((long)Math.pow(2, 15) - 1))
                    System.out.println("* short");
                if (x >= -(long)Math.pow(2, 31) && x <= (long)(Math.pow(2, 31) - 1))
                    System.out.println("* int");
                if (x >= -((long)Math.pow(2, 63)+1) && x <= (long)(Math.pow(2, 63) - 1))
                    System.out.println("* long");
                if (x > (Math.pow(2, 63) - 1))
                    System.out.println(x + " can't be fitted anywhere.");

            } catch (Exception e) {
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }

        }

    }


}



       /* -9223372036854775808
        -9223372036854775807
        4294967296
        4294967295
        -4294967296
        -4294967295
        65536
        65535
        -65536
        -65535
        256
        255
        -256
        -255
        12222222222222222222222222222222222222222221*/
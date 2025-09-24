package run.java.com.javarunprogram.java.hackerrank;

import android.os.Build;


import androidx.annotation.RequiresApi;

import java.time.LocalDate;

public class FindDay {

    @RequiresApi(api = Build.VERSION_CODES.O)
    public static void main(String[] args) {
        System.out.println(findDay(05, 23, 2021));
        print();
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public static String findDay(int month, int day, int year) {
        LocalDate localDate = LocalDate.of(year, month, day);
        return localDate.getDayOfWeek().toString();
    }

    public static void print() {
        String A = "hello";
        String B = "java";
        System.out.println(A.length() + B.length());
        //lexicographically order check
        if (A.toLowerCase().compareTo(B.toLowerCase()) > 0)
            System.out.println("YES");
        else
            System.out.println("NO");
        System.out.println(A.substring(0,1).toUpperCase()+A.substring(1)+ " " + B.substring(0,1).toUpperCase()+B.substring(1));
    }
}

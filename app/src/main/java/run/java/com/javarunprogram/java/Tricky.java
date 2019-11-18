package run.java.com.javarunprogram.java;

import java.io.IOException;
import java.util.HashSet;

public class Tricky {

    public static void main(String[] args) {

        try {
            throw new IOException("Hello");
        }catch( Exception e) {
            System.out.println(e.getMessage());
        }

    }
}

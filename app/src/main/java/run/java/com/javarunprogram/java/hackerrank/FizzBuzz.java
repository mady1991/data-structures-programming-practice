package run.java.com.javarunprogram.java.hackerrank;

public class FizzBuzz {

    public static void main(String[] args) {
        fizzBuzz(15);
        //System.out.println(5 % 5);
    }

    static void fizzBuzz(int n) {
        for (int i = 1; i <= n; i++) {
            checkWhichType(i);
        }

    }

    private static void checkWhichType(int n) {
        if (n % 5 == 0 && n % 3 == 0) {
            System.out.println("FizzBuzz");
        } else if (n % 3 == 0 && n % 5 != 0) {
            System.out.println("Fizz");
        } else if (n % 5 == 0 && n % 3 != 0) {
            System.out.println("Buzz");
        } else if (n % 5 != 0 && n % 3 != 0) {
            System.out.println(n);
        }
    }

}

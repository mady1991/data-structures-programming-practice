package run.java.com.javarunprogram;

public class IsPrimeNumberWitoutLoop {
    public static void main(String[] args) {
        System.out.println(isPrimeNumber(9));
    }

    // Function check whether a number
    // is prime or not
    static int i = 2;

    public static boolean isPrimeNumber(int n) {

        // Corner cases
        if (n == 0 || n == 1) {
            return false;
        }
        // Checking Prime
        if (n == i)
            return true;

        // Base cases
        if (n % i == 0) {
            return false;
        }
        i++;
        return isPrimeNumber(n);
    }
}

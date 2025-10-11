package run.java.com.javarunprogram;

public class LeastPrimenumberIntoNumber {

    public static void main(String[] args) {

        System.out.println(leastPrimeNumbers(9));
    }

    static int oddOrEven = 0;

    public static int leastPrimeNumbers(int n) {
        int leastPrimeNumber = 0;
        oddOrEven = n % 2 == 0 ? 2 : 3;

        // Corner cases
        if (n == 0 || n == 1 || n == 2 || n == 3) {
            leastPrimeNumber = n;
        }
        if (isPrimeNumber(n)) {
            return n;
        }

        // Base cases
        if (n > oddOrEven) {
            leastPrimeNumber = leastPrimeNumbers(n - 1);
        }

        return leastPrimeNumber > oddOrEven ? leastPrimeNumbers(leastPrimeNumber - 1) : leastPrimeNumber;
    }

    public static boolean isPrimeNumber(int number) {

        if (number <= 1)
            return false;

        for (int i = 2; i < number - 1; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;


    }


}

package run.java.com.javarunprogram.java.Array;// Java Code to
// Find pair with 
// maximum GCD in 
// an array 

class GCD {

    // function to calculate gcd of two numbers.
    public static int gcd(int a, int b) {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }

    /* Driver program to test above function */
    public static void main(String[] args) {

        int arr[] = {1, 2, 4, 8, 8, 12};
        int gcd = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            int gc = gcd(gcd, arr[i]);

            gcd = gcd + gc;
        }
        System.out.println(gcd);

    }
}


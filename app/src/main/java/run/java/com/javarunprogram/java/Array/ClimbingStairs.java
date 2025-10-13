package run.java.com.javarunprogram.java.Array;

public class ClimbingStairs {

    public static void main(String[] args) {
        //Input: n = 2
        //Output: 2

        int n = 3;
        int ouput = 0;


        for (int i = 1; i <= n; i++) {

            int step = step(i, n, 0);

            if (step > ouput) {
                ouput = step;
            }
        }
        System.out.println("Max Step : " + ouput);


    }

    public static int step(int i, int n, int count) {
        if (n < i) {
            return count;
        } else {
            count++;
            return step(i, n - i, count);
        }
    }
}

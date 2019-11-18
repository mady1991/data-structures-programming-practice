package run.java.com.javarunprogram.java.Array;

public class KadanAlgoMaxSum {

    public static int kadane(int[] A) {
        int max_here = 0;
        int max_far = 0;
        for (int i = 0; i < A.length; i++) {
            max_here = max_here + A[i];
            max_here = Integer.max(max_here, 0);
            max_far = Integer.max(max_far, max_here);
        }


        return max_far;
    }

    public static void main(String[] args) {

        int[] A = {2, 3, -2, 4, -5, -12, -5};
        for (int i = 0; i < A.length; i++) {
            A[i] = -A[i];
        }
        int nega_max = KadanAlgoMaxSum.kadane(A);

        for (int i = 0; i < A.length; i++) {
            A[i] = -A[i];
        }
        //this gives you max value
        int max = Integer.max(KadanAlgoMaxSum.kadane(A), nega_max);
        //To check which element has large value
        //this gives max product
        System.out.println(max);
    }
}

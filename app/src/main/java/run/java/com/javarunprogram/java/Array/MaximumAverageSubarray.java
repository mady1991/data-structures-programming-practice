package run.java.com.javarunprogram.java.Array;

public class MaximumAverageSubarray {
    public static void main(String[] args) {
        //Input: nums = [1,12,-5,-6,50,3], k = 4
        //Output: 12.75000
        double average = Double.NEGATIVE_INFINITY;
        int a[] = {1, 12, -5, -6, 50, 3};
        int k = 4;

        if (a.length >= k) {
            for (int i = 0; i < a.length - k; i++) {
                double sum = getSum(a, i, k);
                double avg = sum / k;
                if (average < avg) {
                    average = avg;
                }

            }

        }
        System.out.printf("%.5f\n", average);
    }

    private static double getSum(int[] a, int i, int k) {
        double sum = 0.000;
        for (int j = i; j < i + k; j++) {
            sum += a[j];
        }
        return sum;
    }
}

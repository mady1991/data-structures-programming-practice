package run.java.com.javarunprogram.java.Array;

public class MaxSumOfHourGlass {

    static int R = 6;
    static int C = 6;

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] a) {
        if (R < 3 || C < 3) {
            return -1;
        }
        int max_here = 0;
        int max_so_far = Integer.MIN_VALUE;
        for (int row = 0; row < R - 2; row++) {
            for (int col = 0; col < C - 2; col++) {
                max_here = (a[row][col] + a[row][col + 1] + a[row][col + 2] + a[row + 1][col + 1] + a[row + 2][col]
                        + a[row + 2][col + 1] + a[row + 2][col + 2]);
                max_so_far = Integer.max(max_so_far, max_here);
            }
        }

        return max_so_far;
    }

    public static void main(String[] args) {
        int[][] mat = {{-1, -1, 0, -9, -2, -2},
                {-2, -1, -6, -8, -2, -5},
                {-1, -1, -1, -2, -3, -4},
                {-1, -9, -2, -4, -4, -5},
                {-7, -3, -3, -2, -9, -9},
                {-1, -3, -1, -2, -4, -5}};
        System.out.println(hourglassSum(mat));
    }
}

package run.java.com.javarunprogram.java.Array;

public class FindMinMaxInTwoArrays {


    public static void main(String[] args) {
        int a[] = {2, 3, 1, 5, 7};
        int b[] = {9, 6, 4, 3, 8};

        int max = 0, min = Integer.MAX_VALUE;

        for (int i = 0; i < a.length && i < b.length; i++) {
            if (a[i] < b[i] && max < b[i]) {
                max = b[i];
            } else if (a[i] > b[i] && max < a[i]) {
                max = a[i];
            }
            if (a[i] < b[i] && min > a[i]) {
                min = a[i];
            } else if (b[i] > a[i] && min > b[i]) {
                min = b[i];
            }
        }


        System.out.println("max : " + max + " min : " + min);
    }
}

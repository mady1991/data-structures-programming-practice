package run.java.com.javarunprogram.java.Array;

public class FindLargestNSmallest {

    public void largeNSmall(int a[]) {

        int large = 0;
        int small = Integer.MAX_VALUE;
        for (int k = 0; k < a.length; k++) {
            if (a[k] > large) {
                large = a[k];
            }
            if (a[k] < small) {
                small = a[k];
            }
        }


        System.out.println("large " + large + " small " + small);

    }

    public static void main(String[] args) {
        int a[] = {2, 8, 0, 89, 3, 23, 7, 12, 4, 6};
        new FindLargestNSmallest().largeNSmall(a);
    }
}

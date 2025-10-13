package run.java.com.javarunprogram.java.Array;

public class FindPeakElement {
    //Input: nums = [1,2,3,1]
    //Output: 2

    public static void main(String[] args) {
        int a[] = {1, 2, 1, 3, 5, 6, 4};
        int index = -1;
        int highest = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > highest) {
                highest = a[i];
                index = i - 1;
            }
        }
        System.out.print(a[index]);

    }
}

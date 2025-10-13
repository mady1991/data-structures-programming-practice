package run.java.com.javarunprogram.java.Array;

public class FindPivotIndex {
    public static void main(String[] args) {
        //Input: nums = [1,7,3,6,5,6]
        //Output: 3

        int a[] = {1, 7, 3, 6, 5, 6};
        int pivot = -1;

        int sum = 0;
        for (int g : a) {
            sum += g;
        }

        int leftSum = 0;
        int rightSum = 0;

        for (int i = 0; i < a.length; i++) {
            rightSum = sum - leftSum - a[i];

            if (rightSum == leftSum) {
                pivot = i;
                break;
            }
            leftSum += a[i];

        }


        System.out.println(pivot);


    }
}

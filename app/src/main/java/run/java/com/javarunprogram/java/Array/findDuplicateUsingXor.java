package run.java.com.javarunprogram.java.Array;

public class findDuplicateUsingXor {
    //it will work only consecutive order
    public void findDuplicate(int[] A) {
        int xor = 0;

        // take xor of all array elements
        for (int i = 0; i < A.length; i++) {
            xor ^= A[i];
        }

        // take xor of numbers from 1 to n-1
        for (int i = 1; i <= A.length - 1; i++) {
            xor ^= i;
        }
        System.out.println(xor);
    }

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 3};
        new findDuplicateUsingXor().findDuplicate(a);
    }
}

package run.java.com.javarunprogram.java.Array;

public class findDuplicateNumber {

    public void duplicateNumber(int a[]) {
        int n = a.length;
        int duplicate = (n * (n + 1)) / 2;

        int sum = 0;
        for (int i : a) {
            sum += i;
        }

        System.out.println(duplicate - sum);

    }

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        new findDuplicateNumber().duplicateNumber(a);
    }
}

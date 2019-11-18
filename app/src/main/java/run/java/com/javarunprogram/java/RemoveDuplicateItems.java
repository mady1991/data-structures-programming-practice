package run.java.com.javarunprogram.java;

public class RemoveDuplicateItems {
    public static void main(String[] args) {
        int a[] = {1, 2, 2, 2, 3, 3, 3};


        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] == a[i + 1]) {
                a[i] = 0;
            }
        }
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}

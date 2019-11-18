package run.java.com.javarunprogram.java.Array;

public class FindMissingElement {

    static void findMissingElement(int a[]) {

        for (int i = 0; i < a.length; i++) {
            int val = i + 1;
            if (a[i] != val) {
                System.out.println("Missing element :" + val);
            }
        }

    }

    public static void main(String[] args) {
        int a[] = {1, 2, 0, 4, 9};
        FindMissingElement.findMissingElement(a);
    }
}

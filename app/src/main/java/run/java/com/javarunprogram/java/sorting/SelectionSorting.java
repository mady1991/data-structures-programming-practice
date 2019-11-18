package run.java.com.javarunprogram.java.sorting;


public class SelectionSorting {

    public int[] sort(int a[]) {

        for (int i = 0; i < a.length - 1; i++) {

            int min_id = i;

            for (int j = i + 1; j < a.length; j++) {

                if (a[j] < a[min_id]) {
                    min_id = j;
                }
            }

            if (i < min_id) {
                int temp = a[min_id];
                a[min_id] = a[i];
                a[i] = temp;
            }
        }

        return a;
    }

    public static void main(String[] args) {
        int a[] = {7, 1, 3, 2, 4, 5, 6};
        a = new SelectionSorting().sort(a);

    }

}

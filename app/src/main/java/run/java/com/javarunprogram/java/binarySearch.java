package run.java.com.javarunprogram.java;


public class binarySearch {

    public int binaery(int a[], int start, int end, int item) {

        int mid;
        if (end >= start) {
            mid = (start + end) / 2;

            if (item == a[mid]) {
                return mid;
            } else if (a[mid] < item) {
                return binaery(a, mid + 1, end, item);
            } else {
                return binaery(a, start, mid - 1, item);
            }


        }
        return -1;
    }

    public static void main(String[] args) {
        int a[] = {16, 19, 20, 23, 45, 56, 78, 90, 96, 100};
        int item = 96, location = -1;
        location = new binarySearch().binaery(a, 0, a.length - 1, item);
        System.out.println(location);

    }
}

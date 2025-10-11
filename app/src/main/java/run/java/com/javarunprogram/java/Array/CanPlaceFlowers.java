package run.java.com.javarunprogram.java.Array;

public class CanPlaceFlowers {
    public static void main(String[] args) {
        //Input: flowerbed = [1,0,0,0,1], n = 1
        //Output: true

        int a[] = {1, 0, 0, 0, 0, 1};
        int n = 2;

        for (int i = 0; i < a.length - 1; i++) {
            if ((a[i] ^ a[i + 1]) == 0) {
                a[i + 1] = 1;
                n--;
            }
        }
        System.out.println(n <= 0);
    }
}

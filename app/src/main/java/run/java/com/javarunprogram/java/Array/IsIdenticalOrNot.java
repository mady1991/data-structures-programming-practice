package run.java.com.javarunprogram.java.Array;

public class IsIdenticalOrNot {

    //algo method
    public void idebtical(int a[]) {
        int sum = 0;
        int num = a[0];
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        int div = sum / a.length;
        if (div == num) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }


    public static void main(String[] args) {
        int a[] = {2, 2, 2, 2, 2, 1, 2, 2};
        new IsIdenticalOrNot().idebtical(a);
    }
}

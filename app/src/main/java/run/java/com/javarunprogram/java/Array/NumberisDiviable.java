package run.java.com.javarunprogram.java.Array;

public class NumberisDiviable {

    public int divisable(int a[]) {
        int count = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                int reminder = (a[i] + a[j]) % 3;
                if (reminder == 0) {
                    count++;
                    break;
                }

            }

        }


        return count;
    }

    public static void main(String[] args) {
        int a[] = {1, 3, 4, 7, 9, 21};
        System.out.println(new NumberisDiviable().divisable(a));

    }
}

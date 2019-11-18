package run.java.com.javarunprogram.java.Array;

public class ZeroOneSeprate {

    public int[] sorting(int a[]) {
        int i = 0;
        int j = a.length - 1;
        for (int k = 0; k < a.length; k++) {

            if (a[i] == 1) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                j--;

            } else {
                i++;
            }

        }


        return a;
    }

    public static void main(String[] args) {
        int a[]={1,0,1,1,0,0,1,1,0,0,1,0};
        a=new ZeroOneSeprate().sorting(a);
       for (int k = 0; k < a.length; k++) {
           System.out.print(a[k]+" ");
       }

    }

}

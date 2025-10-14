package run.java.com.javarunprogram.java.Array;

import java.util.Arrays;

public class ZeroOneSeprate {

    public int[] sorting(int a[]) {
       int index=0;
        for (int k = 0; k < a.length; k++) {
            if(a[k]==0){
                int temp =a[k];
                a[k]=a[index];
                a[index]=temp;
                index++;
            }

        }
        return a;
    }

    public static void main(String[] args) {
        int a[] = {1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 0};
        a = new ZeroOneSeprate().sorting(a);

        System.out.print(Arrays.toString(a));


    }

}

package run.java.com.javarunprogram.java;

public class LinearSearch {
    public static void main(String[] args) {
        int a[]={23,45,67,12,78,12,56};
        int item=78;
        int ii=-1;
        for (int i=0;i<a.length;i++){
            if(item==a[i]){
                ii=i;
            }
        }

        System.out.println();
    }
}

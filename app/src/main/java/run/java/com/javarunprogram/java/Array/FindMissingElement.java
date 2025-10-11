package run.java.com.javarunprogram.java.Array;

public class FindMissingElement {

    static void findMissingElement(int a[]) {

        for (int i = 0; i < a.length-1; i++) {
            if((a[i]+1)!=a[i+1]){
                System.out.println("Missing element :" + (a[i]+1));
            }

        }

    }

    public static void main(String[] args) {
        int[] a = {0, 1, 3, 4, 6, 7, 8};
        FindMissingElement.findMissingElement(a);
    }
}

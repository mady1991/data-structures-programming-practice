package run.java.com.javarunprogram.java;


public class Experiments {


    static int recusion(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        return n + recusion(n - 1);
    }

    public static void main(String[] args) {

        String java = "Ada";
        StringBuilder stringBuilder = new StringBuilder(java);
        stringBuilder.reverse();
        if (java.equalsIgnoreCase(stringBuilder.toString())) {
            System.out.println("same");
        }else{
            System.out.println("not same");
        }

    }
}

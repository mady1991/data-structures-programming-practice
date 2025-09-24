package run.java.com.javarunprogram.java;

public class FindFactorialProgram {

    public static void main(String[] args) {


        System.out.println(factorial(15, 15));
    }


    public static int factorial(int mainNUmber, int number) {

        //30+15+10+6+5+3+1

        if (number == 0 || number == 1) {
            return number;
        } else if (mainNUmber % number == 0) {
            return number + factorial(mainNUmber, number - 1);
        } else {
            return factorial(mainNUmber, number - 1);
        }


    }
}

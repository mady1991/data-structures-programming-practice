package run.java.com.javarunprogram.java;

public class SumUntilBecomeSingleDigitNumber {

    public static void main(String[] args) {
        int number = 687;
        //output 4
        System.out.println(sumTillSingleDigitNumber(number));
    }

    private static int sumTillSingleDigitNumber(int number) {
        int reminder = getReminder(number);
        return reminder >= 10 ? getReminder(reminder) : reminder;
    }

    /*
    * This method is used to get the sum of all digit of a number
    * Input 687
    * Output 21
    * */

    private static int getReminder(int number) {
        if (number % 10 == number) {
            return number;
        } else {
            return number % 10 + getReminder(number / 10);
        }
    }


}

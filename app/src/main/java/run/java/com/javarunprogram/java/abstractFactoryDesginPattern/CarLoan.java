package run.java.com.javarunprogram.java.abstractFactoryDesginPattern;

public class CarLoan extends Loan {
    @Override
    public void getInterest() {
        rate = 11.99;
    }
}

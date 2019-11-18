package run.java.com.javarunprogram.java.abstractFactoryDesginPattern;

abstract class AbstractFactory {

    abstract Bank getBank(String bank);

    abstract Loan getLoan(String loanType);
}

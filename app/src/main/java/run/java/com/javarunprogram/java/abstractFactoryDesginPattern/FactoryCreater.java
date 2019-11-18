package run.java.com.javarunprogram.java.abstractFactoryDesginPattern;

public class FactoryCreater {

    public AbstractFactory getFacotory(String factoryType) {
        if (factoryType.equalsIgnoreCase("bank")) {
            return new BankFactory();
        } else {
            return new LoanFactory();
        }
    }
}

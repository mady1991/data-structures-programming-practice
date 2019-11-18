package run.java.com.javarunprogram.java.abstractFactoryDesginPattern;

public class BankFactory extends AbstractFactory {
    @Override
    Bank getBank(String bankName) {
        Bank bank = null;

        switch (bankName) {
            case "HDFC":
                bank = new HDFCBank();
                break;
            case "ICIC":
                bank = new ICICIBank();
                break;
            case "Andhra":
                bank = new AndhraBank();
                break;

        }


        return bank;
    }

    @Override
    Loan getLoan(String loanType) {
        return null;
    }
}

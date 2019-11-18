package run.java.com.javarunprogram.java.abstractFactoryDesginPattern;

public class LoanFactory extends AbstractFactory {
    @Override
    Bank getBank(String bankName) {
        return null;
    }

    @Override
    Loan getLoan(String loanType) {
        Loan loan = null;
        switch (loanType) {
            case "home":
                loan = new HomeLoan();
                break;
            case "education":
                loan = new EducationLoan();
                break;
            case "car":
                loan = new CarLoan();
                break;
        }

        return loan;
    }
}

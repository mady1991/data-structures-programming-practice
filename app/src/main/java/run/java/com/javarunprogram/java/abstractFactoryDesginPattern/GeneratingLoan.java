package run.java.com.javarunprogram.java.abstractFactoryDesginPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GeneratingLoan {

    public static void main(String[] args) throws IOException {
        FactoryCreater factoryCreater = new FactoryCreater();

        AbstractFactory abstractFactory = factoryCreater.getFacotory("bank");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the bank Name");
        String bankName = bufferedReader.readLine();

        Bank bank = abstractFactory.getBank(bankName);
        //here we have get the bank name;
        abstractFactory = factoryCreater.getFacotory("loan");
        Loan loan = abstractFactory.getLoan("home");
        loan.getInterest();
        System.out.println("Enter the no of years");
        int NoY = Integer.parseInt(bufferedReader.readLine());
        System.out.println("Enter the loan amount");
        int amount = Integer.parseInt(bufferedReader.readLine());

        loan.calulatation(NoY, amount);

    }
}

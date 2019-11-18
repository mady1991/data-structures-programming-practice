package run.java.com.javarunprogram.java.abstractFactoryDesginPattern;

public abstract class Loan {
    double rate = 0;

    public abstract void getInterest();

    public void calulatation(int NOY, double amount) {

        double EMI;
        int n;

        n=NOY*12;
        rate=rate/1200;
        EMI=((rate*Math.pow((1+rate),n))/((Math.pow((1+rate),n))-1))*amount;

        System.out.println("your monthly EMI is "+ EMI +" for the amount"+amount+" you have borrowed");

    }
}

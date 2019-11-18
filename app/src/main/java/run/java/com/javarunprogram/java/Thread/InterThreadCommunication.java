package run.java.com.javarunprogram.java.Thread;

class Customer {

    int amount = 10000;

    synchronized public void widthdraw(int debit) throws InterruptedException {
        System.out.println("going to withdraw amount");

        if (debit < amount) {
            amount = amount - debit;

        } else {
            wait();
            amount = amount - debit;
        }
        System.out.println("transition completed" + "\nRemainig amount is " + amount);
    }



    synchronized public void deposit(int credit) throws InterruptedException {
        Thread.sleep(2000);
        amount = amount + credit;
        notify();
        System.out.println("your deposit is successfully done " + "\nNow your total balance is " + amount);
    }
}

public class InterThreadCommunication {
    public static void main(String[] args) {
        Customer customer = new Customer();

        new Thread() {
            @Override
            public void run() {
                super.run();
                try {
                    customer.widthdraw(13000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                super.run();
                try {
                    customer.widthdraw(15000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }.start();
        new Thread() {
            @Override
            public void run() {
                super.run();
                try {
                    customer.deposit(7000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }.start();

    }
}

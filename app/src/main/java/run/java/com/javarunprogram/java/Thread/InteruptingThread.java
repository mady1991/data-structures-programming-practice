package run.java.com.javarunprogram.java.Thread;

class Interput extends Thread {

    @Override
    public void run() {

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.getStackTrace();
        }

        System.out.println("Thread is runnig");

    }
}

public class InteruptingThread {
    public static void main(String[] args) {
        Interput threadExample = new Interput();
        threadExample.start();
        threadExample.interrupt();


    }
}

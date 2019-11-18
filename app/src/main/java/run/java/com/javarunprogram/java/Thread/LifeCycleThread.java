package run.java.com.javarunprogram.java.Thread;

public class LifeCycleThread extends Thread {

    @Override
    public synchronized void start() {
        super.start();
        System.out.println("need to check how many times it will call"+getState());
    }

    @Override
    public void run() {
        super.run();
        System.out.println("Primaid is going on"+getState());
        for (int i = 0; i < 10; i++) {
            for (int j = 10 - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public static void main(String[] args) throws InterruptedException {
        LifeCycleThread lifeCycleThread = new LifeCycleThread();
        System.out.println(lifeCycleThread.getState());//pint new
        lifeCycleThread.start();
        System.out.println(lifeCycleThread.getState());//print runabble

    }


}

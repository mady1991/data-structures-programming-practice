package run.java.com.javarunprogram.java.Thread;

class SleepThreadExample extends Thread {


    @Override

     public void run() {
        super.run();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(getName() + "run--" + getState());
    }
}


public class SleepThread {

    public static void main(String[] args) {
        SleepThreadExample sleepThreadExample = new SleepThreadExample();
        sleepThreadExample.setName("Thread 1");

        SleepThreadExample sleepThreadExample1 = new SleepThreadExample();
        sleepThreadExample1.setName("Thread 2");

        sleepThreadExample.start();

        sleepThreadExample1.start();

    }
}




package run.java.com.javarunprogram.java.Thread;

public class ThreadPriority extends Thread {
    @Override
    public void run() {
        super.run();
        System.out.println("Thread " + getName() + " its has priority--" + getPriority());
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadPriority threadPriority = new ThreadPriority();
        ThreadPriority threadPriority1 = new ThreadPriority();
        ThreadPriority threadPriority2 = new ThreadPriority();
        threadPriority1.setPriority(Thread.MAX_PRIORITY);
        threadPriority2.setPriority(Thread.MAX_PRIORITY);

        threadPriority.start();
        threadPriority1.start();
        threadPriority2.start();


    }
}

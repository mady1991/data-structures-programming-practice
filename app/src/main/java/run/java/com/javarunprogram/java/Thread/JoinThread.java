package run.java.com.javarunprogram.java.Thread;

class Task implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 500; i++) {
            System.out.print(" " + i);
        }

    }
}

public class JoinThread {
    public static void main(String[] args) throws InterruptedException {
        Task task = new Task();
        Thread thread = new Thread(task);
        System.out.println("Mian thread start");
        thread.start();
        System.out.println("Main thread wait for child thread to be finished");
        thread.join(100);
        System.out.println("resume main ");
    }
}

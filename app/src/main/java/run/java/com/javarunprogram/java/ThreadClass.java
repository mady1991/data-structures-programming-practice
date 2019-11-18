package run.java.com.javarunprogram.java;

public class ThreadClass implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + "------->" + i + " " + Thread.currentThread().getPriority());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    static Thread my, my1, my2;

    public static void main(String[] args) {
        ThreadClass threadClass = new ThreadClass();
        ThreadClass threadClass1 = new ThreadClass();
        ThreadClass threadClass2 = new ThreadClass();

        my = new Thread(threadClass);
        my1 = new Thread(threadClass1);
        my2 = new Thread(threadClass2);
        my1.setPriority(Thread.MAX_PRIORITY);
        my2.setPriority(Thread.MIN_PRIORITY);

        my.setName("Thread1");
        my1.setName("Thread2");
        my2.setName("Thread3");


        my.start();
        try {
            my.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        my1.start();
        my2.start();


    }
}
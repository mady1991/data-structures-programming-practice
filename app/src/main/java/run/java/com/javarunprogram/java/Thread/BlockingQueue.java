package run.java.com.javarunprogram.java.Thread;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

class Producer implements Runnable {
    BlockingDeque blockingDeque;

    public Producer(BlockingDeque blockingDeque) {
        this.blockingDeque = blockingDeque;
    }

    @Override
    synchronized public void run() {

        for (int i = 1; i <= 20; ++i) {
            try {
                blockingDeque.put("data" + String.valueOf(i));
                System.out.println(Thread.currentThread().getName() + " Producing :" + "data" + String.valueOf(i));

            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + " giving " + e.getMessage());
                e.printStackTrace();
            }
        }

    }
}

class Consumer implements Runnable {
    BlockingDeque blockingDeque;

    public Consumer(BlockingDeque blockingDeque) {
        this.blockingDeque = blockingDeque;

    }

    @Override
    synchronized public void run() {


        for (int i = 1; i <= 20; ++i) {
            try {
                System.out.println(Thread.currentThread().getName() + " Consumer :" + blockingDeque.take());
                if (blockingDeque.isEmpty() == true) {
                    wait();
                }
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + " giving " + e.getMessage());
                e.printStackTrace();
            }
        }
    }
}


public class BlockingQueue {

    public static void main(String[] args) throws InterruptedException {
        BlockingDeque blockingDeque = new LinkedBlockingDeque(5);
        Producer producer = new Producer(blockingDeque);
        Consumer consumer = new Consumer(blockingDeque);
        Thread prodThread = new Thread(producer);
        Thread consThread = new Thread(consumer);
        prodThread.start();
        consThread.start();

    }
}

package run.java.com.javarunprogram.java.Thread;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

class TaskThreadPool implements Runnable {
    String name;

    TaskThreadPool(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is doing " + name);

    }

}


public class ThreadPool {
    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) Executors.newFixedThreadPool(5);
        for (int i = 0; i < 20; i++) {
            TaskThreadPool task = new TaskThreadPool("Task_" + i);
            threadPoolExecutor.execute(task);
        }
        System.out.println("checking...");
    }


}

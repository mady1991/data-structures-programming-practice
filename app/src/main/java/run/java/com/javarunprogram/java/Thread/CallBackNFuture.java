package run.java.com.javarunprogram.java.Thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallBackNFuture implements Callable {
    @Override
    public String call() throws InterruptedException {
        Thread.sleep(1000);
        return Thread.currentThread().getName();
    }


    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        CallBackNFuture callBackNFuture = new CallBackNFuture();
        Future<String> future = executorService.submit(callBackNFuture);
        System.out.println(future.get());
    }
}

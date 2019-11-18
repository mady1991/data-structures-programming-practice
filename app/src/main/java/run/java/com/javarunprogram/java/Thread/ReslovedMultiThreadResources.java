package run.java.com.javarunprogram.java.Thread;

import java.util.concurrent.atomic.AtomicInteger;


class SafeCounterWithoutLock {
    private final AtomicInteger counter = new AtomicInteger(0);

    public int getValue() {
        return counter.get();
    }

    public void increment() {
        while (true) {
            int existingValue = getValue();
            int newValue = existingValue + 1;
            if (counter.compareAndSet(existingValue, newValue)) {
                return;
            }
        }
    }
}

class Increment {
    static volatile int counter = 0;


    public void increment() {
        counter++;
    }

    public int getIncrement() {
        return counter;
    }
}

class IncrementThread extends Thread {
    SafeCounterWithoutLock increment;

    public IncrementThread(SafeCounterWithoutLock increment) {
        this.increment = increment;
    }


    @Override
    public void run() {
        super.run();
        increment.increment();
        System.out.println("Increment or not"+increment.getValue());
    }
}

public class ReslovedMultiThreadResources {


    public static void main(String[] args) {
        // Increment increment = new Increment();
        SafeCounterWithoutLock increment = new SafeCounterWithoutLock();
        IncrementThread incrementThread = new IncrementThread(increment);
        IncrementThread incrementThread1 = new IncrementThread(increment);
        incrementThread.start();
        incrementThread1.start();


    }
}

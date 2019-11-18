package run.java.com.javarunprogram.java.Thread;

class CustomRunable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(getClass() + " i-->" + i);
        }
    }
}

public class CustomThread extends Thread {
    CustomRunable myRunable;

    public CustomThread(CustomRunable myRunable) {
        this.myRunable = myRunable;
    }

    @Override
    public void run() {
        System.out.println("this is also need to be invoked");

        myRunable.run();
    }

    public static void main(String[] args) {
        CustomRunable myRunable = new CustomRunable();
        Thread myThread = new CustomThread(myRunable);
        myThread.setName("MYYYY");
        myThread.start();
        //only start method involke thread and if want to check thraed is running than is alive method help us
        System.out.println("Thread--" + myThread.getName() + "is alvie " + myThread.isAlive());

    }
}

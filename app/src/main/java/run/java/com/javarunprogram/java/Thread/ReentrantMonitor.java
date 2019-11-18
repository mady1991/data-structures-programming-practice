package run.java.com.javarunprogram.java.Thread;

class Reetrant {

    synchronized public void m() {
        n();
        System.out.println("we are in m method ");
    }

    synchronized public void n() {
        System.out.println("we are in n method");
    }
}

class ReetrantThread extends Thread {

    @Override
    public void run() {
        super.run();
        new Reetrant().m();
    }
}


public class ReentrantMonitor {

    public static void main(String[] args) {
        ReetrantThread reetrantThread = new ReetrantThread();
        reetrantThread.start();
    }
}

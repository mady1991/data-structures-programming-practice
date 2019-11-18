package run.java.com.javarunprogram.java.Thread;

class TableStatic {

   synchronized public static void printTableStatic(int t) throws InterruptedException {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i * t);
            Thread.sleep(100);
        }

    }
}

class PrintTableStatic extends Thread {

    int t;

    PrintTableStatic(int t) {
        this.t = t;
    }


    @Override
    public void run() {
        super.run();
        try {
            TableStatic.printTableStatic(t);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}


public class SyncStatic {

    public static void main(String[] args) throws InterruptedException {

        PrintTableStatic printTable = new PrintTableStatic(1);
        printTable.start();

        PrintTableStatic printTable2 = new PrintTableStatic(100);
        printTable2.start();
        printTable.join();
        //if you use join instead synchronized method or block than it work same

        PrintTableStatic printTable1 = new PrintTableStatic(10);
        printTable1.start();


    }
}

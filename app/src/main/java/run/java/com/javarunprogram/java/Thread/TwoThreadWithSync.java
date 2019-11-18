package run.java.com.javarunprogram.java.Thread;

class Table {

    //synchronized accurie lock and not release untill thread excutation
    synchronized public void printTable(int t) throws InterruptedException {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i * t);
            Thread.sleep(100);
        }
    }
}

class PrintTable extends Thread {
    Table obj;
    int t;

    PrintTable(Table obj, int t) {
        this.obj = obj;
        this.t = t;
    }


    @Override
    public void run() {
        super.run();
        try {
            obj.printTable(t);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}


public class TwoThreadWithSync {

    public static void main(String[] args) throws InterruptedException {
        Table table = new Table();
        PrintTable printTable = new PrintTable(table, 1);
        printTable.start();

        PrintTable printTable1 = new PrintTable(table, 10);
        printTable1.start();


    }
}

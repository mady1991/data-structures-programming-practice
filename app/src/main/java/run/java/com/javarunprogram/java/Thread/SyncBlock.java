package run.java.com.javarunprogram.java.Thread;

class TableBlock {

    public void printTableBlock(int t) throws InterruptedException {
        synchronized (TableBlock.this) {
            for (int i = 1; i <= 5; i++) {
                System.out.println(i * t);
            }
        }
    }
}

class PrintTableBlock extends Thread {
    TableBlock obj;
    int t;

    PrintTableBlock(TableBlock obj, int t) {
        this.obj = obj;
        this.t = t;
    }


    @Override
    public void run() {
        super.run();
        try {
            obj.printTableBlock(t);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}


public class SyncBlock {

    public static void main(String[] args) throws InterruptedException {
        TableBlock table = new TableBlock();
        PrintTableBlock printTable = new PrintTableBlock(table, 1);
        printTable.start();

        PrintTableBlock printTable1 = new PrintTableBlock(table, 10);
        printTable1.start();


    }
}

package run.java.com.javarunprogram.java.Thread;

import java.util.LinkedList;

public class CreateBloclkingQueue {
    LinkedList list = new LinkedList();
    int limit;

    public CreateBloclkingQueue(int limit) {
        this.limit = limit;
    }

    synchronized public void add(Object o) throws InterruptedException {
        if (list.size() == limit) {
            System.out.println("Queue size is full so now go for consumer");
            wait();
        } else {
            list.add(o);
            System.out.println("Producer--" + list);
            if (list.size() == limit) {
                notifyAll();
            }
        }

    }

    synchronized public void remove() throws InterruptedException {
        if (list.size() == 0) {
            System.out.println("consumer waiting for queue to be filled");
            wait();
        } else if (list.size() == limit) {
            System.out.println("data is full now so get it ");
            notifyAll();
        }
        for (int i = 0; i < limit - 1; i++) {
            list.remove(i);
            System.out.println("consumer consuem data");
        }


    }

    public static void main(String[] args) throws InterruptedException {

        CreateBloclkingQueue bloclkingQueue = new CreateBloclkingQueue(3);
        bloclkingQueue.add("Batman");
        bloclkingQueue.add("CatWomen");
        bloclkingQueue.add("Superman");
        bloclkingQueue.remove();
        bloclkingQueue.add("AA");
        bloclkingQueue.add("BB");
        bloclkingQueue.add("CC");

    }
}

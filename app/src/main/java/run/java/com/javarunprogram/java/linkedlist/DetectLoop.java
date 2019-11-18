package run.java.com.javarunprogram.java.linkedlist;

import java.util.HashSet;

public class DetectLoop {

    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public void add(int data) {
        Node node = new Node(data);
        node.next = head;
        head = node;
    }

    public void printNode(Node head) {

        while (head != null) {
            System.out.print(head.data + "->");
            head = head.next;
        }
        System.out.println("Null");

    }

    boolean detectLoop(Node h) {
        HashSet<Node> s = new HashSet<Node>();
        while (h != null) {
            if (s.contains(h))
                return true;

            s.add(h);

            h = h.next;
        }

        return false;
    }

    public static void main(String[] args) {
        DetectLoop detectLoop = new DetectLoop();
        detectLoop.add(20);
        detectLoop.add(4);
        detectLoop.add(15);
        detectLoop.add(10);
        detectLoop.add(20);
        detectLoop.printNode(detectLoop.head);
        detectLoop.head.next.next.next.next = detectLoop.head;
        System.out.println(detectLoop.detectLoop(detectLoop.head));

    }

}

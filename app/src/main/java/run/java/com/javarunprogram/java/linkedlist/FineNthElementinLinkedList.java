package run.java.com.javarunprogram.java.linkedlist;

public class FineNthElementinLinkedList {
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

    public void findNthElement() {
        Node prev = null;
        Node current = head;
        while (current != null) {
            if (current.next == null) {
                prev = current;
            }
            current = current.next;

        }
        if (prev != null) {
            System.out.println(prev.data);
        }

    }

    public static void main(String[] args) {
        FineNthElementinLinkedList detectLoop = new FineNthElementinLinkedList();
        detectLoop.add(20);
        detectLoop.add(4);
        detectLoop.add(15);
        detectLoop.add(10);
        detectLoop.add(4);
        detectLoop.printNode(detectLoop.head);
        detectLoop.findNthElement();

    }


}

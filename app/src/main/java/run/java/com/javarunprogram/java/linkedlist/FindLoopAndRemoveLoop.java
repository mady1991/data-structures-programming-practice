package run.java.com.javarunprogram.java.linkedlist;

public class FindLoopAndRemoveLoop {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }


    }

    void push(int data) {
        Node node = new Node(data);
        node.next = head;
        head = node;
    }

    void findLoop(Node head) {
        Node slow = head;
        Node fast = head;

        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                removeLoop(slow);
            }
        }


    }

    private void removeLoop(Node slow) {
        Node p1 = null;
        Node p2 = null;

        p1 = slow;
        p2 = slow;


        //find last postion of loop
        while (p2.next != p1) {
            p2 = p2.next;
        }
        p2.next = null;

    }

    void print(Node head) {
        while (head != null) {
            System.out.print(head.data + "->");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        FindLoopAndRemoveLoop loop = new FindLoopAndRemoveLoop();
        loop.push(1);
        loop.push(2);
        loop.push(3);
        loop.push(4);
        loop.push(5);
        loop.push(6);

        loop.head.next.next.next.next.next.next = loop.head.next.next.next.next;

        loop.findLoop(loop.head);
        loop.print(loop.head);
    }


}

package run.java.com.javarunprogram.java.linkedlist;

public class CheckCilculorLinkedList {

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

    void print(Node head) {
        while (head != null) {

            System.out.print(head.data + "->");
            head = head.next;
        }
    }

    boolean checkCilculor(Node head) {
        Node slow = head;
        Node fast = head;
        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        CheckCilculorLinkedList circle = new CheckCilculorLinkedList();
        circle.push(1);
        circle.push(2);
        circle.push(3);
        circle.push(4);
        circle.push(5);
        circle.head.next.next.next.next.next = circle.head;
        System.out.println(circle.checkCilculor(circle.head));
    }

}

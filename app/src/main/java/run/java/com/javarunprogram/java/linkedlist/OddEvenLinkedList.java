package run.java.com.javarunprogram.java.linkedlist;

public class OddEvenLinkedList {
    Node head;

    class Node {
        int data;
        Node next = null;

        Node(int data) {
            this.data = data;
        }
    }

    void push(int data) {
        Node node = new Node(data);
        node.next = head;
        head = node;
    }

    void print() {
        Node node = head;
        while (node != null) {
            System.out.print(node.data + "->");
            node = node.next;
        }
        System.out.println("Null");
    }

    void OddEvenList(Node node) {
        Node p1 = node;
        Node p2 = node.next;
        Node connectNode = node.next;
        while (p1 != null && p2 != null) {

            p1.next = p2.next;
            p1 = p1.next;

            p2.next = p1.next;
            p2 = p2.next;
        }
        p1.next = connectNode;
    }

    public static void main(String[] args) {
        OddEvenLinkedList odd = new OddEvenLinkedList();
        odd.push(1);
        odd.push(2);
        odd.push(3);
        odd.push(4);
        odd.push(5);

        odd.print();
        odd.OddEvenList(odd.head);
        odd.print();
    }

}

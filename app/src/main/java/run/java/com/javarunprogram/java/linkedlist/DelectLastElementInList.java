package run.java.com.javarunprogram.java.linkedlist;

public class DelectLastElementInList {

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
        System.out.println("Null");
    }

    void findNRemoveLastElement(Node node) {
        Node prev = null;
        Node current = node;

        if (current != null) {

            while (current != null) {
                if (current.next != null) {
                    prev = current;
                }
                current = current.next;
            }

            if (current != null && current.next != null) {
                prev.next = current.next;
            } else {
                prev.next = null;
            }


        }
    }

    public static void main(String[] args) {
        DelectLastElementInList lis = new DelectLastElementInList();
        for (int i = 5; i > 0; i--) {
            lis.push(i);
        }
        lis.print(lis.head);
        lis.findNRemoveLastElement(lis.head);
        lis.print(lis.head);
    }

}

package run.java.com.javarunprogram.java.linkedlist;

public class ReverseLinkedList {
    Node head;

    class Node {

        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public void add(int data) {
        Node node = new Node(data);
        node.next = head;
        head = node;
    }

    /* Function to reverse the linked list */
    Node reverse(Node head) {
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    private Node reverseRecursively(Node node) {
        Node newHead;
        if ((node.next == null)) {
            return node;
        }
        newHead = reverseRecursively(node.next);
        // reverse the link e.g. C->D->null will be null
        node.next.next = node;
        node.next = null;
        return newHead;
    }


    // prints content of double linked list
    void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + "->");
            node = node.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {
        ReverseLinkedList llist = new ReverseLinkedList();

        for (int i = 1; i < 5; ++i) {
            llist.add(i);
        }

        System.out.println("Given Linked list");
        llist.printList(llist.head);
        llist.head = llist.reverseRecursively(llist.head);
        System.out.println("");
        System.out.println("Reversed linked list ");
        llist.printList(llist.head);

    }
}




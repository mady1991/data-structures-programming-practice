package run.java.com.javarunprogram.java.linkedlist;

public class ReverseAlternateK {

    Node head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public void push(int newdata) {
        Node mynode = new Node(newdata);
        mynode.next = head;
        head = mynode;
    }

    void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    public Node reverseKNode(Node head, int k) {
        Node pre = null;
        Node current = head;
        Node next = null;
        int count = 0;
        while (current != null && count < k) {
            next = current.next;
            current.next = pre;
            pre = current;
            current = next;
            count++;
        }
        if (head != null) {
            head.next = current;
        }



        count = 0;
        while (count < k - 1 && current != null) {
            current = current.next;
            count++;
        }
        return pre;
    }

    public static void main(String[] args) {
        ReverseAlternateK rever = new ReverseAlternateK();
        for (int i = 20; i > 0; i--) {
            rever.push(i);
        }


        rever.printList(rever.reverseKNode(rever.head, 4));
    }
}

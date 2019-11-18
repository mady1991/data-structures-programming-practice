package run.java.com.javarunprogram.java.linkedlist;

public class DeletedNodeWithoutHeader {
    Node head;

    class Node {
        int data;
        Node next = null;

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

    //copy data of next into current node point n remove next
    void delete(Node node) {
        Node temp = node.next;
        node.data = temp.data;
        node.next = temp.next;
        System.gc();
    }

    void print() {
        Node node=head;
        while (node != null) {
            System.out.print(node.data + "->");
            node = node.next;
        }
        System.out.print("Null");
        System.out.println();
    }

    public static void main(String[] args) {
        DeletedNodeWithoutHeader myclas = new DeletedNodeWithoutHeader();
        myclas.push(1);
        myclas.push(2);
        myclas.push(3);
        myclas.push(4);
        myclas.push(5);
        myclas.print();
        Node node=myclas.head.next.next;
        myclas.delete(node);
        myclas.print();
    }


}

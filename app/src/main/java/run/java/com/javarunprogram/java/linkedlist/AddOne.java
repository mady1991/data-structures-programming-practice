package run.java.com.javarunprogram.java.linkedlist;

// Java program to add 1 to a linked list
class AddOne {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    Node push(int data) {
        Node node = new Node(data);
        node.next = null;
        return node;
    }

    void print(Node node) {
        while (node != null) {
            System.out.print(node.data + "->");
            node = node.next;
        }
        System.out.println("Null");
    }

    Node resverse(Node head) {
        Node current = head;
        Node pre = null;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = pre;
            pre = current;
            current = next;

        }
        return pre;
    }

    Node addOne(Node head) {
        head = resverse(head);
        head = addUntilOne(head);

        return resverse(head);
    }

    private Node addUntilOne(Node head) {
        int sum = 0, carry = 1;
        Node result = head;


        while (head != null) {

            sum = carry + head.data;
            carry = (sum >= 10) ? 1 : 0;
            sum = sum % 10;
            head.data = sum;
            head = head.next;

        }

        return result;
    }

    public static void main(String[] args) {
        AddOne one = new AddOne();
        Node head = one.push(1);
        head.next = one.push(9);
        head.next.next = one.push(9);
        head.next.next.next = one.push(9);

        System.out.print("MuList is ");
        one.print(head);

        head = one.addOne(head);
        System.out.println();
        System.out.print("Resultant list is ");
        one.print(head);
    }


}


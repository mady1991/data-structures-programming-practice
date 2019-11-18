package run.java.com.javarunprogram.java.linkedlist;

import java.util.Stack;

public class CheckLinkedListisPalindrome {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public void push(int data) {
        Node node = new Node(data);
        node.next = head;
        head = node;
    }

    public void printNode(Node head) {
        Node headd = head;
        while (headd != null) {
            System.out.print(headd.data + "->");
            headd = headd.next;
        }
        System.out.println("");
    }


    public boolean palinDromeCheck(Node head) {
        Stack<Node> list = new Stack<>();
        Node current = head;
        while (current != null) {
            list.add(current);
            current = current.next;
        }
        current = head;
        while (current != null) {
            Node i = list.pop();
            if (i.data != current.data) {
                return false;
            } else {
                current = current.next;
            }

        }


        return true;
    }





    public static void main(String[] args) {
        CheckLinkedListisPalindrome chek = new CheckLinkedListisPalindrome();
        chek.push(1);
        chek.push(2);
        chek.push(1);
        chek.push(1);

        /*for (int i = 1; i > 0; i--) {
            chek.push(i);
        }*/



        System.out.println(chek.palinDromeCheck(chek.head));
    }

}

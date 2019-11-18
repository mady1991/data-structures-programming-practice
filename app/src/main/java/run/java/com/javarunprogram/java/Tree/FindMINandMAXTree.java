package run.java.com.javarunprogram.java.Tree;

public class FindMINandMAXTree {


    Node insertNode(Node head, int data) {
        if (head == null) {
            head = new Node(data);
        } else {
            if (head.data >= data) {
                head.left = insertNode(head.left, data);
            } else {
                head.right = insertNode(head.right, data);
            }
        }
        return head;
    }


    void findMiniume(Node head) {
        if (head == null) {
            System.out.println("No data");
            return;
        }
        while (head.left != null) {
            head = head.left;
        }
        System.out.println("Max value: " + head.data);
    }

    //find minimue value using recursion
    Node findMin(Node node) {
        if (node.left == null)
            return node;
        else {
            return findMin(node.left);
        }
    }

    Node findMaxRecursion(Node node) {
        if (node.right == null)
            return node;
        else {
            return findMaxRecursion(node.right);
        }
    }


    void findMax(Node head) {
        if (head == null) {
            System.out.println("No data");
            return;
        }
        while (head.right != null) {
            head = head.right;
        }
        System.out.println("Min value: " + head.data);
    }


    public static void main(String[] args) {
        FindMINandMAXTree findMINandMAXTree = new FindMINandMAXTree();
        Node head = null;
        head = findMINandMAXTree.insertNode(head, -11);
        findMINandMAXTree.insertNode(head, 6);
        findMINandMAXTree.insertNode(head, 3);
        findMINandMAXTree.insertNode(head, 4);
        findMINandMAXTree.insertNode(head, 5);
        findMINandMAXTree.findMiniume(head);
        findMINandMAXTree.findMax(head);
        if (head != null) {
            System.out.println(findMINandMAXTree.findMin(head).data);
        }
    }
}

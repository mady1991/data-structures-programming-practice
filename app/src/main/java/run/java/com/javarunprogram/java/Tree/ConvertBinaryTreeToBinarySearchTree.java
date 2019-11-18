package run.java.com.javarunprogram.java.Tree;

import java.util.Arrays;

public class ConvertBinaryTreeToBinarySearchTree extends BinaryTree {

    int array[] = null;
    int index = 0;

    int sizeOfTree(Node head) {
        if (head == null) {
            return 0;
        } else {
            return sizeOfTree(head.left) + sizeOfTree(head.right) + 1;
        }
    }

    void CreateBinaryTreeToArray(Node head) {

        if (head.left != null) {
            CreateBinaryTreeToArray(head.left);
        }
        array[index] = head.data;
        index++;
        if (head.right != null) {
            CreateBinaryTreeToArray(head.right);
        }
    }

    Node createArrayToBinearySearchTree(int low, int high) {
        if (low > high)
            return null;
        int mid = (low + high) / 2;
        Node root = new Node(array[mid]);
        root.left = createArrayToBinearySearchTree(low, mid - 1);
        root.right = createArrayToBinearySearchTree(mid + 1, high);

        return root;

    }

    Node createBTtoBST(Node head) {
        int sizeofBT = sizeOfTree(head);
        array = new int[sizeofBT];
        CreateBinaryTreeToArray(head);
        Arrays.sort(array);
        head = createArrayToBinearySearchTree(0, array.length - 1);

        return head;
    }


    public static void main(String[] args) {
        ConvertBinaryTreeToBinarySearchTree bt = new ConvertBinaryTreeToBinarySearchTree();
        //Add nodes to the binary tree
        bt.root = new Node(1);
        bt.root.left = new Node(2);
        bt.root.right = new Node(3);
        bt.root.left.left = new Node(4);
        bt.root.left.right = new Node(5);
        bt.root.right.left = new Node(6);
        bt.root.right.right = new Node(7);

        //Display given binary tree
        System.out.println("Inorder representation of binary tree: ");
        bt.printInOrder(bt.root);
        bt.root = bt.createBTtoBST(bt.root);
        System.out.println();
        //Display given binary tree
        System.out.println("Inorder representation of binary search tree: ");
        bt.printInOrder(bt.root);
    }


}

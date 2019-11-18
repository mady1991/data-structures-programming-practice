package run.java.com.javarunprogram.java.Tree;


public class BinaryTree {
    Node root;


    BinaryTree() {
        root = null;
    }

    BinaryTree(int data) {
        root = new Node(data);
    }

    //InOrder trasves
    void printInOrder(Node node) {
        if (node == null) {
            return;
        }
        printInOrder(node.left);
        System.out.print(node.data + " ");
        printInOrder(node.right);
    }

    void printPostOrder(Node node) {
        if (node == null) {
            return;
        }
        printPostOrder(node.left);
        printPostOrder(node.right);
        System.out.print(node.data + " ");
    }

    void printPreOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data + " ");
        printPreOrder(node.left);
        printPreOrder(node.right);

    }

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree(1);
        binaryTree.root.left = new Node(2);
        binaryTree.root.right = new Node(3);
        binaryTree.root.left.left = new Node(4);
        binaryTree.root.right.right = new Node(5);


        binaryTree.printPreOrder(binaryTree.root);
        System.out.println();
        binaryTree.printInOrder(binaryTree.root);
        System.out.println();
        binaryTree.printPostOrder(binaryTree.root);

    }


}

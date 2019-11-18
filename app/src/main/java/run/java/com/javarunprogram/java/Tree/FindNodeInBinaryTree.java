package run.java.com.javarunprogram.java.Tree;

public class FindNodeInBinaryTree extends BinaryTree {

    Node findNode(Node root, int data) {
        if (root == null) {
            return null;
        }
        if (root.data == data) {
            return root;
        }
        if (root.left != null) {
            return findNode(root.left, data);
        }

        if (root.right != null) {
            return findNode(root.right, data);
        }

        return null;
    }

    public static void main(String[] args) {
        FindNodeInBinaryTree tree = new FindNodeInBinaryTree();
        tree.root = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left = new Node(4);
        tree.root.left.right = new Node(8);
        tree.root.left.left = new Node(9);
        tree.root.left.left.left = new Node(1);
        tree.root.left.right = new Node(5);
        Node node = tree.findNode(tree.root, 9);
        System.out.println(node);
    }
}

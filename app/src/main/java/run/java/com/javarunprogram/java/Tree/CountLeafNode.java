package run.java.com.javarunprogram.java.Tree;

public class CountLeafNode extends BinaryTree {

    int countLeafNode(Node root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }

        return countLeafNode(root.left) + countLeafNode(root.right);
    }

    int productLeafNode(Node node) {
        if (node == null) {
            return 1;
        }
        if (node.left == null && node.right == null) {
            return node.data;
        }

        return productLeafNode(node.left) * productLeafNode(node.right);
    }

    int CountNonLeaf(Node root) {
        if (root == null) {
            return 0;
        }
        if (root.left != null || root.right != null) {
            return CountNonLeaf(root.left) + CountNonLeaf(root.right) + 1;
        }
        return 0;
    }

    int sumNonLeaf(Node root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return root.data;
        }

        if (root.left != null || root.right != null) {
            return sumNonLeaf(root.left) + sumNonLeaf(root.right);
        }
        return 0;
    }

    public static void main(String[] args) {
        CountLeafNode tree = new CountLeafNode();
        /* create a tree */
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right = new Node(3);
        tree.root.right.right = new Node(7);
        tree.root.right.left = new Node(6);
        tree.root.right.left.right = new Node(8);

        //System.out.println(tree.countLeafNode(tree.root));
        System.out.println(tree.sumNonLeaf(tree.root));
    }
}

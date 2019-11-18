package run.java.com.javarunprogram.java.Tree;

public class FindDeepestNodeInTree extends BinaryTree {

    private Node deepestNode(Node root) {
        if (root == null) {
            return null;
        }
        if (root.right == null && root.left == null) {
            return root;
        }
        int sizeLeft = calculateSizeofTree(root.left);
        int sizeRight = calculateSizeofTree(root.right);
        if (sizeLeft > sizeRight) {
            return deepestNode(root.left);
        } else {
            return deepestNode(root.right);
        }
    }

    int heightOfTree(Node root) {
        if (root == null) {
            return 0;
        }
        int depthL = heightOfTree(root.left);
        int depthR = heightOfTree(root.right);
        if (depthL > depthR) {
            return depthL + 1;
        } else {
            return depthR + 1;
        }


}

    int calculateSizeofTree(Node root) {
        if (root == null) {
            return 0;
        }
        return calculateSizeofTree(root.left) + calculateSizeofTree(root.right) + 1;
    }

    public static void main(String[] args) {
        FindDeepestNodeInTree tree = new FindDeepestNodeInTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
       // tree.root.right.right.right = new Node(8);
        Node d = tree.deepestNode(tree.root);
        System.out.println(d.data);

        //System.out.println(tree.heightOfTree(tree.root));
    }


}

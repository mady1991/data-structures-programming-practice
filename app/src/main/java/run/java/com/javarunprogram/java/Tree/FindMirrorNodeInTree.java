package run.java.com.javarunprogram.java.Tree;

public class FindMirrorNodeInTree extends BinaryTree {
    int findMirror(int target, Node root) {
        if (root == null) {
            return 0;
        }
        if (root.data == target) {
            return target;
        }

        return findMirrorRec(target, root.left, root.right);
    }

    private int findMirrorRec(int target, Node left, Node right) {
        if (left == null && right == null) {
            return 0;
        }
        if (left.data == target) {
            return right.data;
        }
        if (right.data == target) {
            return left.data;
        }

        return findMirrorRec(target, left.left, right.right);
    }

    public static void main(String[] args) {
        FindMirrorNodeInTree tree = new FindMirrorNodeInTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.left.left = new Node(4);
        tree.root.left.left.right = new Node(7);
        tree.root.right = new Node(3);
        tree.root.right.left = new Node(5);
        tree.root.right.right = new Node(6);
        tree.root.right.left.left = new Node(8);
        tree.root.right.left.right = new Node(9);

        int target = tree.root.left.left.data;

        int mirror = tree.findMirror(target, tree.root);

        if (mirror != 0)
            System.out.println("Mirror of Node " + target + " is Node " + mirror);
        else
            System.out.println("Mirror of Node " + target + " is null ");
    }
}

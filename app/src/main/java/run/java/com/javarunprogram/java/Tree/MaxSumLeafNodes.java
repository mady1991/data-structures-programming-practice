package run.java.com.javarunprogram.java.Tree;

public class MaxSumLeafNodes extends BinaryTree {

    int maxAtSameLevel(Node root) {
        int sum = 0;
        if (root == null) {
            return sum;
        }
        if (root.left != null && checkMoreLevel(root.left))
            sum += root.left.data;
        if (root.right != null && checkMoreLevel(root.right))
            sum += root.right.data;
        return sum;
    }

    boolean checkMoreLevel(Node root) {

        if (root != null && root.left != null)
            return false;
        if (root != null && root.right != null)
            return false;
        return true;
    }

    int findMax(Node node) {
        int max = 0;
        if (node == null) {
            return 0;
        }
        int sum = 0;
        if (root.left != null) {
            sum += maxAtSameLevel(root.left);
        }
        if (root.right != null) {
            sum += maxAtSameLevel(root.right);
        }
        if (sum > max) {
            max = sum;
        }
        return sum;

    }

    int heightOfTtree(Node root) {
        if (root == null) {
            return 0;
        }
        int depthL = heightOfTtree(root.left);
        int deplthR = heightOfTtree(root.right);
        if (deplthR > deplthR){
            return deplthR+1;
        }else{
           return depthL+1;
        }
    }



    public static void main(String[] args) {
        MaxSumLeafNodes tree = new MaxSumLeafNodes();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.right = new Node(8);
        tree.root.right.right.left = new Node(6);
        tree.root.right.right.right = new Node(7);

        System.out.println(tree.heightOfTtree(tree.root));
    }
}


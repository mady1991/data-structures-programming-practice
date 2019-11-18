package run.java.com.javarunprogram.java.Tree;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class VerticalOrderOfTree extends BinaryTree {

    void verticalOrder(Node root, int HD, TreeMap<Integer, ArrayList<Integer>> m) {
        if (root == null) {
            return;
        }
        ArrayList<Integer> mg = m.get(HD);
        if (mg == null) {
            mg = new ArrayList<>();
        }
        mg.add(root.data);

        m.put(HD, mg);
        if (root.left != null) {
            verticalOrder(root.left, HD - 1, m);
        }
        if (root.right != null) {
            verticalOrder(root.right, HD + 1, m);
        }
    }

    void levelOrderTraversal(Node root, int level, TreeMap<Integer, ArrayList<Integer>> m) {
        if (root == null) {
            return;
        }
        ArrayList<Integer> mg = m.get(level);
        if (mg == null) {
            mg = new ArrayList<>();
        }
        mg.add(root.data);
        m.put(level, mg);
        if (root.left != null) {
            levelOrderTraversal(root.left, level + 1, m);
        }
        if (root.right != null) {
            levelOrderTraversal(root.right, level + 1, m);
        }

    }

    void PrintVerticalOrder(Node root) {
        if (root == null) {
            return;
        }
        TreeMap<Integer, ArrayList<Integer>> m = new TreeMap<>();
        verticalOrder(root, 0, m);
        for (Map.Entry<Integer, ArrayList<Integer>> entry : m.entrySet()) {
            System.out.println(entry.getKey() + "---->" + entry.getValue());
        }
    }

    void printLevelOrder(Node root) {
        if (root == null) {
            return;
        }
        TreeMap<Integer, ArrayList<Integer>> m = new TreeMap<>();
        levelOrderTraversal(root, 0, m);
        for (Map.Entry<Integer, ArrayList<Integer>> entery : m.entrySet()) {
            System.out.println(entery.getKey() + "--->" + entery.getValue());
        }
    }

    public static void main(String[] args) {
        VerticalOrderOfTree tree = new VerticalOrderOfTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.right = new Node(4);
        tree.root.left.right.right = new Node(5);
        tree.root.left.right.right.right = new Node(6);
        System.out.println("Following are nodes in top view of Binary Tree");
        tree.printLevelOrder(tree.root);
    }

}

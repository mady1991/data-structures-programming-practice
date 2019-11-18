package run.java.com.javarunprogram.java.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class SolveProblem extends BinaryTree {

    void TopView(Node root) {
        class QueueOb {
            int hd;
            Node node;

            QueueOb(int hd, Node node) {
                this.hd = hd;
                this.node = node;
            }
        }

        Queue<QueueOb> q = new LinkedList<>();
        TreeMap<Integer, Integer> map = new TreeMap<>();
        if (root == null) {
            return;
        }
        q.add(new QueueOb(0, root));
        while (!q.isEmpty()) {
            QueueOb temp = q.poll();
            if (!map.containsKey(temp.hd)) {
                map.put(temp.hd, temp.node.data);
            }
            if (temp.node != null && temp.node.left != null) {
                q.add(new QueueOb(temp.hd - 1, temp.node.left));
            }

            if (temp.node != null && temp.node.right != null) {
                q.add(new QueueOb(temp.hd + 1, temp.node.right));
            }

        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.print(entry.getValue() + " ");
        }


    }

    void printVerticalOrder(Node root) {
        if (root == null) {
            return;
        }
        TreeMap<Integer, ArrayList<Integer>> map = new TreeMap<>();
        verticalOrder(root, 0, map);
        for (Map.Entry<Integer, ArrayList<Integer>> enter : map.entrySet()) {
            System.out.println(enter.getValue());
        }
    }

    void verticalOrder(Node root, int HD, TreeMap<Integer, ArrayList<Integer>> map) {
        if (root == null) {
            return;
        }

        ArrayList<Integer> mg = map.get(HD);
        if (mg == null) {
            mg = new ArrayList<>();
        }
        mg.add(root.data);
        map.put(HD, mg);
        if (root.left != null) {
            verticalOrder(root.left, HD - 1, map);
        }
        if (root.right != null) {
            verticalOrder(root.right, HD + 1, map);
        }
    }

    int heightOfTree(Node node) {
        if (node == null) {
            return 0;
        }
        int heightL = heightOfTree(node.left);
        int heightR = heightOfTree(node.right);
        if (heightL > heightR) {
            return heightL + 1;
        } else {
            return heightR + 1;
        }
    }


    public static void main(String[] args) {
        SolveProblem tree = new SolveProblem();
        tree.root = new Node(20);
        tree.root.left = new Node(8);
        tree.root.right = new Node(22);
        tree.root.left.left = new Node(5);
        tree.root.left.right = new Node(3);
        tree.root.right.left = new Node(4);
        tree.root.right.right = new Node(25);
        tree.root.left.right.left = new Node(10);
        tree.root.left.right.right = new Node(14);
        System.out.println("Bottom view of the given binary tree:");

        System.out.println(tree.heightOfTree(tree.root));
    }
}

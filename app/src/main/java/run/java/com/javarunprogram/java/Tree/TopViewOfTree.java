package run.java.com.javarunprogram.java.Tree;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;


public class TopViewOfTree extends BinaryTree {

    void TopView(Node root) {

        class QueueObj {
            Node node;
            int hd;

            QueueObj(Node node, int hd) {
                this.node = node;
                this.hd = hd;
            }
        }
        Queue<QueueObj> q = new LinkedList<>();
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();

        if (root == null) {
            return;
        } else {
            q.add(new QueueObj(root, 0));
        }

        while (!q.isEmpty()) {
            QueueObj tempNode = q.poll();
            if (!treeMap.containsKey(tempNode.hd)) {
                treeMap.put(tempNode.hd, tempNode.node.data);
            }
            if (tempNode.node.left != null) {
                q.add(new QueueObj(tempNode.node.left, tempNode.hd - 1));
            }
            if (tempNode.node.right != null) {
                q.add(new QueueObj(tempNode.node.right, tempNode.hd + 1));
            }
        }
        for (Map.Entry<Integer, Integer> entry : treeMap.entrySet()) {
            System.out.print(entry.getValue() + " ");
        }

    }

    public static void main(String[] args) {
        TopViewOfTree tree = new TopViewOfTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.right = new Node(4);
        tree.root.left.right.right = new Node(5);
        tree.root.left.right.right.right = new Node(6);
        System.out.println("Following are nodes in top view of Binary Tree");
        tree.TopView(tree.root);
    }
}

package run.java.com.javarunprogram.java.Tree;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class BottomViewOfTree extends BinaryTree {

    void BottomView(Node root) {
        class QueueObj {
            Node node;
            int hd;

            QueueObj(Node node, int hd) {
                this.node = node;
                this.hd = hd;
            }
        }
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        Queue<QueueObj> q = new LinkedList<>();
        if (root == null) {
            return;
        }
        q.add(new QueueObj(root, 0));
        while (!q.isEmpty()) {
            QueueObj temp = q.poll();
            treeMap.put(temp.hd, temp.node.data);
            if (temp.node.left != null) {
                q.add(new QueueObj(temp.node.left, temp.hd - 1));
            }
            if (temp.node.right != null) {
                q.add(new QueueObj(temp.node.right, temp.hd + 1));
            }
        }


        for (Map.Entry entry : treeMap.entrySet()) {
            System.out.print(entry.getValue() + " ");
        }
    }

    public static void main(String[] args) {
        BottomViewOfTree tree = new BottomViewOfTree();
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
        tree.BottomView(tree.root);
    }
}

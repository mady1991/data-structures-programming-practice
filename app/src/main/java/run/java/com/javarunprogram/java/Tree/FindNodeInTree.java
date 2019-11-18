package run.java.com.javarunprogram.java.Tree;

public class FindNodeInTree extends FindMINandMAXTree {

    Node findNode(Node node, Node findData) {
        if (node != null && node.data == findData.data) {
            return node;
        } else if (node != null && findData.data < node.data) {
            return findNode(node.left, findData);
        } else if (node != null && findData.data > node.data) {
            return findNode(node.right, findData);
        } else {
            return null;
        }
    }

    public static void main(String[] args) {
        FindNodeInTree findtree = new FindNodeInTree();
        Node head = null;
        head = findtree.insertNode(head, 1);
        findtree.insertNode(head, 2);
        findtree.insertNode(head, 3);
        findtree.insertNode(head, 4);
        findtree.insertNode(head, 5);
        findtree.insertNode(head, 6);
        Node node = new Node(9);
        head = findtree.findNode(head, node);
        if (head != null && head.data == node.data) {
            System.out.println("Item found");
        } else {
            System.out.println("Item not found");
        }

    }
}

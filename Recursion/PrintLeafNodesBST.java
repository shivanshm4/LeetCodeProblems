package Recursion;

public class PrintLeafNodesBST {

    static class Node {
        int val;
        Node right, left;
    }

    static Node insert(Node head, int value) {

        if (head == null) {
            head = new Node();
            head.val = value;
            head.left = head.right = null;
            return head;
        }

        if (value < head.val) {
            head.left = insert(head.left, value);
        }

        if (value > head.val) {
            head.right = insert(head.right, value);
        }

        return head;
    }

    static void printLeafNode(Node head) {

        if(head == null) {
            return;
        }
        if (head.left == null && head.right == null) {
            System.out.println(head.val);
        } else if (head.right == null) {
            printLeafNode(head.left);
        } else if (head.left == null) {
            printLeafNode(head.right);
        } else {
            printLeafNode(head.left);
            printLeafNode(head.right);
        }

    }

    public static void main(String[] args) {

        Node head = new Node();
        insert(head, 5);
        insert(head, 100);
        insert(head, 110);
        insert(head, 2);

        System.out.println("Insertion Done!");
        printLeafNode(null);
        System.out.println("Leaf Nodes: ");
        printLeafNode(head);

    }

}

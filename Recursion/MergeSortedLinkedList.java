package Recursion;

public class MergeSortedLinkedList {
    static class Node {
        int val;
        Node next;

        Node(int value, Node next) {
            this.val = value;
            this.next = next;
        }

        void setNext(Node next) {
            this.next = next;
        }
    }

    static Node mergeSortedLinkedList(Node A, Node B) {
        if (A == null)
            return B;
        if (B == null)
            return A;
        if (A.val < B.val) {
            A.next = mergeSortedLinkedList(A.next, B);
            return A;
        }
        B.next = mergeSortedLinkedList(A, B.next);
        return B;
    }

    public static void main(String[] args) {
        Node head = new Node(10, null);
        Node n2 = new Node(15, null);
        Node n3 = new Node(18, null);
        Node n4 = new Node(19, null);
        Node n5 = new Node(25, null);

        Node head2 = new Node(9, null);
        Node n22 = new Node(11, null);
        Node n32 = new Node(18, null);
        Node n42 = new Node(20, null);
        Node n52 = new Node(28, null);

        head.setNext(n2);
        n2.setNext(n3);
        n3.setNext(n4);
        n4.setNext(n5);

        head2.setNext(n22);
        n22.setNext(n32);
        n32.setNext(n42);
        n42.setNext(n52);

        Node temp = head;
        temp = mergeSortedLinkedList(head, head2);
        System.out.println("Linked List: ");
        while (temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
    }

}

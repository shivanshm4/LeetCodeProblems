package MiddleElementOfLinkedList;

class LinkedList {

    public Node insert(int num, Node root) {
        if (root == null) {
            root = new Node(num);
        } else {
           root.next = insert(num, root.next);
        }

        return root;
    }

    public Node middleNode(Node root) {

        Node fastPointer, slowPointer;
        fastPointer = slowPointer = root;
        while(fastPointer != null && fastPointer.next != null ) {
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next; 
        }

        return slowPointer;
    }
}

class Node {
    int num;
    Node next;

    Node(int num) {
        this.num = num;
        this.next = null;
    }
    @Override
    public String toString() {
        return "Node [next=" + next + ", num=" + num + "]";
    }
   
}
class Solution {

    public static void main(String args[]) {
        Node root = null;
        LinkedList linkedList =  new LinkedList();
        root = linkedList.insert(6, root);
        root = linkedList.insert(20, root);
        root = linkedList.insert(-9, root);
        root = linkedList.insert(-29, root);
        root = linkedList.insert(-33, root);
        root = linkedList.insert(-239, root);
        root = linkedList.insert(-2953, root);
        root = linkedList.insert(-2953, root);
        System.out.println(root.toString());
        Node middle = linkedList.middleNode(root);
        System.out.println(middle);
        
    }
}
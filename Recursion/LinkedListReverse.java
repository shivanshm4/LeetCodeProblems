package Recursion;

class LinkedListReverse {

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

  static Node reverseLinkedList(Node n) {
    if(n == null || n.next == null) {
      return n;
    }

    Node newHead = reverseLinkedList(n.next);
    n.next.next = n;
    n.next =  null;
    return newHead;
  }

  public static void main(String[] args) {
    Node head = new Node(1, null);
    Node n2 = new Node(2, null);
    Node n3 = new Node(3, null);
    Node n4 = new Node(4, null);
    Node n5 = new Node(5, null);

    head.setNext(n2);
    n2.setNext(n3);
    n3.setNext(n4);
    n4.setNext(n5);

    Node temp = head;
    temp = reverseLinkedList(head);
    System.out.println("Linked List: ");
    while(temp!=null) {
      System.out.println(temp.val);
      temp = temp.next;
    }
  }


}

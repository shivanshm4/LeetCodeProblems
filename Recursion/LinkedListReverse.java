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

  public static void main(String[] args) {
    Node head = new Node(1, null);
    Node n2 = new Node(2, null);
    head.setNext(n2);

    System.out.println("Linked List: ");
    while(head!=null) {
      System.out.println(head.val);
      head = head.next;
    }
  }


}

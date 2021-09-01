package model;

public class Snake {
    
    private int tail;
    private int head;
    public int getTail() {
        return tail;
    }
    public void setTail(int tail) {
        this.tail = tail;
    }
    public int getHead() {
        return head;
    }
    public void setHead(int head) {
        this.head = head;
    }
    @Override
    public String toString() {
        return "Snake [head=" + head + ", tail=" + tail + "]";
    }
    


}

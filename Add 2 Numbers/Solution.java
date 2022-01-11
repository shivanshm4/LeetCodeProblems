/**
 * Definition for singly-linked list. */
 class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    @Override
    public String toString() {
        return "ListNode [next=" + next + ", val=" + val + "]";
    }
 }




class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode l3 = new ListNode();
        ListNode temp = l3;
        int carry = 0;
        while (l1!=null || l2!=null){
            
            if( l1 == null) {
                if (l2.val + carry > 9 ) {
                carry = 1;
                temp.val = (l2.val+carry)%10;
            } else {
                temp.val = l2.val + carry;
                carry = 0;
            }
            l2 = l2.next;
            } else if(l2 == null){
                if (l1.val + carry > 9 ) {
                carry = 1;
                temp.val = (l1.val+carry)%10;
            } else {
                temp.val = l1.val + carry;
                carry = 0;
            }
                l1 = l1.next;
            } else if (l1 != null && l2!=null) {
                if (l1.val + l2.val + carry > 9 ) {
                
                temp.val = (l1.val + l2.val+carry)%10;
                carry = 1;
            } else {
                temp.val = l1.val + l2.val + carry;
                carry = 0;
            }
                 l1 = l1.next;
            l2 = l2.next;
            }
            
           
            if (l1 == null && l2 == null && carry == 0){
                break;
            } else if ( l1 == null && l2 == null &&  carry == 1) {
                temp.next = new ListNode();
                temp.next.val = carry;
                break;
            }
            temp.next = new ListNode();
            temp = temp.next;
        }
        
        return l3;
        
    }

    public static void main(String args[]) {
        ListNode l1,  l2;
        l1 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))))));
        Solution solution = new Solution();
        l2 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));
        System.out.println(solution.addTwoNumbers(l1, l2).toString());
    }
}
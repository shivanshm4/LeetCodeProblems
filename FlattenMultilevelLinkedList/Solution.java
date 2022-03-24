package FlattenMultilevelLinkedList;

// public class Solution {
//     public Node flatten(Node head) {
        
//         Node temp = head;
//         Stack<Node> level = new Stack<>();
//         while(temp.next!=null){
//             if(temp.child != null){
//                 Node thisLevel = temp;
//                 level.add(thisLevel);
//                 temp.next = temp.child;
//                 temp.child.prev = temp;
//                 temp.child = null;
//             }
            
//             if(temp.next == null) {
//                 Node lastLevelNode = level.pop();
//                 temp.next = lastLevelNode.next;
//             }
            
//             temp = temp.next;
//         }
        
//         return head;
//     }
// }

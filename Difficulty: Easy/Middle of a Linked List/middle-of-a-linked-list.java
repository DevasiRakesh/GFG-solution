/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/

class Solution {
    int getMiddle(Node head) {
        // Your code here.
        Node slow=head,fast=head;
        while(fast!=null && fast.next!=null){slow=slow.next;fast=fast.next.next;}
        return slow.data;
    }
}
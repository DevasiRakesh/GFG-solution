/*
class DLLNode {
    int data;
    DLLNode next;
    DLLNode prev;

    DLLNode(int val) {
        data = val;
        next = null;
        prev = null;
    }
}
*/
class Solution {
    public DLLNode reverseDLL(DLLNode head) {
        // Your code here
        DLLNode curr=head,prev1=null,nxt;
        while(curr!=null){
            nxt=curr.next;
            curr.next=prev1;
            curr.prev=nxt;
            prev1=curr;
            curr=nxt;
        }
        return prev1;
    }
}
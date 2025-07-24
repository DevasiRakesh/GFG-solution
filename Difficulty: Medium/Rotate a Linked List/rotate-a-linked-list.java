/* node of linked list:

class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
} */

class Solution {
    public Node rotate(Node head, int k) {
        // add code here
        //step 1. find len and tail of a linked list
        int len=1;
        Node tail=head;
        while(tail.next!=null){tail=tail.next;len++;}
        //step 2.normalize the k val in the range of linked list
        k=k%len;
        if(k==0){return head;}
        //step 3.connect tail to head
        tail.next=head;
        //step 4 find newtail and tail.next is newhead (k)
        Node newtail=head;
        for(int i=1;i<k;i++){newtail=newtail.next;}
        Node newhead=newtail.next;
        newtail.next=null;
        return (k!=0)newhead;
        
    }
}
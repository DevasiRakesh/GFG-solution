/* Structure of node
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
} */

class Solution {

    // Function to find the data of kth node from
    // the end of a linked list.
    int getKthFromLast(Node head, int k) {
        // Your code here
        Node first=head;
        for(int i=1;i<k;i++){if(first!=null)first=first.next;}
        if(first==null){return -1;}
        Node sec=head;
        while(first.next!=null){
            sec=sec.next;
            first=first.next;
        }
        return sec.data;
    }
}
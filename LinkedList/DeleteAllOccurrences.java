//GFG : Delete all occurrences of a given key in a doubly linked list

class Solution {
    static Node deleteAllOccurOfX(Node head, int x) {
        // Write your code here
        Node temp = head;
        while(temp!=null){
            if(temp.data==x){
                if(temp.prev==null){
                    head = head.next;
                    head.prev = null;
                }
                else if(temp.next==null){
                    temp = temp.prev;
                    temp.next = null;
                }
                else{
                    Node n = temp.next;
                    temp = temp.prev;
                    temp.next = n;
                    n.prev = temp;
                }
            }
            temp=temp.next;
        }
        return head;
    }
}

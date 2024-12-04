//GFG : Remove duplicates from a sorted doubly linked list

class Solution{
    Node removeDuplicates(Node head){
        // Code Here.
        int prev = Integer.MIN_VALUE;
        Node temp = head;
        
        while(temp!=null && temp.next!=null){
            Node nextNode = temp.next;
            while (nextNode != null && nextNode.data == temp.data) {
                nextNode = nextNode.next;
            }
            temp.next = nextNode;
            if (nextNode != null) nextNode.prev = temp;
            temp = temp.next;
        }
        return head;
    }
}

//GFG : Find pairs with given sum in doubly linked list


class Solution {
    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target, Node head) {
        // code here
        ArrayList<ArrayList<Integer>> ans = new ArrayList();
        Node first = head;
        Node second = head;
        
        while(second.next!=null){
            second = second.next;
        }
        
        while(first!=second && second.next!=first){
            if(second.data + first.data == target){
                ArrayList<Integer> a = new ArrayList();
                
                a.add(first.data);
                a.add(second.data);
                ans.add(a);
                first = first.next;
                second = second.prev;
            }
            else{
            if(second.data+first.data<target){
                first = first.next;
            }
            else{
                second = second.prev;
            }}
            
        }
        return ans;
    }
}

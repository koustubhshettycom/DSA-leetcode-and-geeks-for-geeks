/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nextLargerNodes(ListNode head) {
    //Easy logic convert the ll into a list then use stack if ele greater in stc add it else keep popping until empty
    //if empty its 0 and if the top ele exits it is the val and push curr in stc
        ArrayList<Integer> ll = new ArrayList<>();
        for(ListNode node = head;node!=null;node=node.next){
            ll.add(node.val);
        }
        int[] ans = new int[ll.size()];
        Stack<Integer> stc = new Stack<>();
        for(int i=ans.length-1;i>=0;i--){
            while(!stc.isEmpty()&& ll.get(i)>=stc.peek()){
                stc.pop();
            }
            if(stc.isEmpty()){
                ans[i]=0;
            }
            else{
                ans[i]=stc.peek();
            }
            stc.push(ll.get(i));
        }

        return ans;
        
        
    }
}//Time complexity is O(n)
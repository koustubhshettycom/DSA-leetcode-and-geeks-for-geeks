/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        // Easy logic as the LL is cyclic fast and slow pointer is used
        // in this method as they are cyclic fast and slow has to meet eachother atleast once 
        ListNode fast = head;
        ListNode slow = head;

        while(fast!= null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                return true;
            }
        }

        return false;
        
    }
}// Tine complexity O(n)
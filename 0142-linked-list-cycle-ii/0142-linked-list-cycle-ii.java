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
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        ListNode start = head;
        // The logic is little complicated its is the same as finding cycle first
    // then the start of the cycle is k times from the list as well as the node the pointers met 
    // u need to remember this one  

        while(fast!= null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                break;
            }
        }
        if(fast == null || fast.next == null){
            return null;
        }

        while(start!= slow){
            start=start.next;
            slow=slow.next;
        }
        return start;


    }
}
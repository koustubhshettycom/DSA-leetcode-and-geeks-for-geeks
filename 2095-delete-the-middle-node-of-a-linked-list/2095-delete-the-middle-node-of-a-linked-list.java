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
    public ListNode deleteMiddle(ListNode head) {
        // as middle of the ll is invokved use fast and slow pointers 
        // Connect the node behind the middle to the node front of the middle
        ListNode slow=head;
        ListNode fast=head;
        if(fast.next==null){
            return null;
        }
        while(fast.next.next!=null && fast.next.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;

        }
        slow.next = slow.next.next;

        return head;
        
    }
}// Time complexity is O(n)
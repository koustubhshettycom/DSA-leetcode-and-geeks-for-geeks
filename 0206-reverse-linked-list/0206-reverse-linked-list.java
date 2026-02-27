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
    public ListNode reverseList(ListNode head) {
        // easy logic use 3 variable connect backwards in the end make the last node head 
        // make the actual head pointing towards null
        if(head==null || head.next ==null){
            return head;
        }
        ListNode prev = head;
        ListNode end = head;
        ListNode opp = head.next;
        ListNode temp = opp.next;
        while(temp!=null){
            opp.next = prev;
            prev = opp;
            opp = temp;
            temp = temp.next;

        }
        opp.next = prev;
        head = opp;
        end.next = null;
        return head;
        
    }
}
// Time complexity O(n)
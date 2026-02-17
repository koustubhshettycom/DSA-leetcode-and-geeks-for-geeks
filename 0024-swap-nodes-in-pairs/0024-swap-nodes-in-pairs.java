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
    public ListNode swapPairs(ListNode head) {
        // this is a good question u need a variable to point and 2 to swap 
        // prev is for connecting and temp and front is for swapping
        if(head==null || head.next==null){
            return head;
        }
        ListNode temp = head;
        ListNode prev = null;
        
        
        while(temp!=null && temp.next!=null){
            ListNode front = temp.next;
            temp.next = temp.next.next;
            front.next = temp;
            if(prev== null){
                head= front;
            }
            else{
                prev.next = front;
            }
            prev = temp;
            temp = temp.next;

            
        }
        return head;
        
    }
}// Time complexity is O(n)
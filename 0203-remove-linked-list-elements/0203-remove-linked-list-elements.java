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
    public ListNode removeElements(ListNode head, int item) {
        // logic is to see the end cases of being null and the tail part
        // the main logic--> the next item is equal to the value then point to next of the next 
        while (head != null && head.val == item) {
            head = head.next;
        }

        ListNode temp = head;
        while(temp != null && temp.next != null){
           if(temp.next.val == item){
            temp.next = temp.next.next;
           }
           else{
            temp = temp.next;
           }

        }
        return head;
        
    }
}// Time complexity is O(n)
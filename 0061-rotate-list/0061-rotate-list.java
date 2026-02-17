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
    public ListNode rotateRight(ListNode head, int k) {
        // the logic is easy look into the end cases first 
        // then use slow anf fast pointer method
        // use fast to check the length and join the end to the head 
        // take the actual number of steps excluding all the unnecessary rotations as k 
        // move slow,count-1-k steps ahead this covers all the cases unlike k steps
        // make its next node as the head and point the slow towards null
        if (head == null || head.next == null || k == 0){
            return head;
        }
        
        int count =0;
        ListNode fast = head;
        ListNode slow = head;

        while(fast.next!=null){
            count++;
            fast = fast.next;

        }
        count++;
        k = k%count;
        if(k==0){
            return head;
        }
        
        fast.next = head;
        for(int i=0;i<count-1-k;i++){
            slow = slow.next;

        }
        head = slow.next;
        slow.next = null;
        return head;

        
        
    }
}// Time complexity is O(n)
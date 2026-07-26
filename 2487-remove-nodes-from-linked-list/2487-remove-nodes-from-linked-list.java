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
    public ListNode removeNodes(ListNode head){
        //Easy logic reverse the ll first store the max with each forward 
        //Ommit the ones tht r lesser than max return after reversing again
        head = reverse(head);
        int max = head.val;
        ListNode curr = head;
        while(curr!= null && curr.next!= null){
            if(curr.next.val<max){
                curr.next = curr.next.next;
            }
            else {
                max = curr.next.val;
                curr = curr.next;
            }
        }

        return reverse(head);
    }

    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}// Time complexity is O(n)
    
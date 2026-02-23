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
    public ListNode oddEvenList(ListNode head) {
    // logic is simple connect all the nodes alternatively and in the end connect them
    // the main end case is if the arr is even and for that temp2.next case is taken in while loop
    // one more important point is joining node is seperately taken and then connected 
        if(head == null){
            return head;
        }
        ListNode temp1 = head;
        ListNode temp2 = head.next;
        ListNode temp = head.next;

        while(temp1!=null && temp2!=null && temp2.next!=null){
            temp1.next = temp1.next.next;
            temp2.next = temp2.next.next;
            temp1 = temp1.next;
            temp2 = temp2.next;

        }
        temp1.next =temp;
        return head;
        
    }
}
// Time complexity is O(n)
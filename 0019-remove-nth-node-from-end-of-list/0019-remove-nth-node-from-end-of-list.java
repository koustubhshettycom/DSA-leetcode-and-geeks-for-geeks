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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // the logic here is to traverse once completely and go length-n steps ahead
        // the other logic of same complexity but smarter way is fast and slow pointer 
        // move fast pointer n times ahead then make both the point move step by step until 
        // fast becomes null the slow moves (l-n)steps and fast moves (l-n)+n steps 
        
        ListNode back = head;
        int count=0;
        ListNode temp = head;
        

        while(back!=null){
            count++;
            back = back.next;
        }
        if(n == count) {
          return head.next;
        }
        

        for(int i=1;i<count-n;i++){
            temp = temp.next;
        }
        
        temp.next = temp.next.next;

        return head;




     // Time complexity is O(n)   
        
    }
}
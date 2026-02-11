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
    public ListNode middleNode(ListNode head) {
        // traversing through the linkedlist first to get the count 
        // second traversal till its half then returning it 
        // remember this one approach of other solution of fast and slow pointer method 
        ListNode temp = head;
        int count =1;
        
        while(temp.next != null){
            temp = temp.next;
            count++;
        }
        count++;
        temp = head;


        for(int i=1;i<((Math.ceilDiv(count,2)));i++){
            temp= temp.next;
        }

        return temp;
    
    }
}// Time complexity is O(n)
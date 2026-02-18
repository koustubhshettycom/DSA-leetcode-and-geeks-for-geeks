/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // Logic is simple when they have a common point return it 
        // When a pointer reaches the end of its list send it to other lsit
        // if it will not meet u will return null simply
        // if it meets u will be return the common node 

        ListNode temp1 = headA;
        ListNode temp2 = headB;
        
        while( temp1 != temp2){
            if(temp1 == null){
                temp1 = headB;
            }
            else{
                temp1 = temp1.next;
            }
            if(temp2 == null){
                temp2 = headA;
            }
            else{
                temp2 = temp2.next;
            }

        }

        return temp1;
       
    }// Time complexity is O(n)
}
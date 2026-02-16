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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // there are multiple cases for this 
        // 1) if either of them is null
        // 2) create a node with 2 diff pointer one to return and one to traverse 
        // 3) the last case is when one of them is empty completely add the other left 
        if(list1== null){
            return list2;
        }
        if(list2==null){
            return list1;
        }
        ListNode head;
        ListNode current;

        if(list1.val>list2.val){
            head = list2;
            list2 = list2.next;
        }
        else{
            head= list1;
            list1 = list1.next;
        }
        current = head;
        while(list1!= null && list2!= null){
            

            if(list1.val>list2.val){
                current.next = list2;
                list2= list2.next;
            }
            else{
                current.next = list1;
                list1 = list1.next;
            }
            current = current.next;
        }
        if(list1!=null){
            current.next = list1;
           

        }
        else{
            current.next = list2;
           
        }
        return head;

        
    }
}// Time complexity is O(n)
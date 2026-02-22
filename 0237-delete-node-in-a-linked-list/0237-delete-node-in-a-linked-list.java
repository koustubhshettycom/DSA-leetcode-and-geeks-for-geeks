/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    // easy logic tricky question here u have a node which u need to remove already given
    // take the node and overwrite it with the next node value and drop the very next node 
    public void deleteNode(ListNode node) {
       node.val = node.next.val;
       node.next = node.next.next;
       return;
        
        
    }
}
//Time complexity id O(n)
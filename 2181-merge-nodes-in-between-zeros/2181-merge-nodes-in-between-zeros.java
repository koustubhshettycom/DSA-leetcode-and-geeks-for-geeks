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
    // easy logic maintain the sum bw 2 0's and replace them with right nodes
    public ListNode mergeNodes(ListNode head) {
        int sum =0;
        int count =1;
        ListNode item = head;
        ListNode start = head;
        while(item !=null){
            if(item.val==0 && item!=head){
                start.val = sum;
                start = start.next;
                count++;
                sum =0;
            }
            else{
                sum+= item.val;
            }
            
            item = item.next;
        }
        start = head;
        for(int i=1;i<count-1;i++){
            start = start.next;
        }
        start.next = null;
        return head;
    }
}//Time complexity is O(n)
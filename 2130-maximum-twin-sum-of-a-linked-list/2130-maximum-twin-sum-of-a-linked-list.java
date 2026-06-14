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
    public int pairSum(ListNode head) {
        // use array to store values and iterate them from front and back and get max
        // but the better approach is to find the mid and from mid reverse the ll till end 
        // them compare from the mid and start 
        int max=0;
        int count=0;
        int count1=0;
        
        ListNode curr = head;
         while(curr!=null){
            curr = curr.next;
            count1++;
        }
        curr = head;
        int[] arr = new int[count1];
        while(curr!=null){
            arr[count]=curr.val;
            curr = curr.next;
            count++;
        }
        for(int i=0;i<count/2;i++){
            max = Math.max(max,arr[i]+arr[count-i-1]);
        }
        return max;
       

        
        
    }
}// Time complexity O(n) space complexity is higher 
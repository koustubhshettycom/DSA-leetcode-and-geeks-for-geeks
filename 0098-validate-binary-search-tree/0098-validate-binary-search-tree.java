/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isValidBST(TreeNode root) {
        //Easy logic for start with max and min val of long acc to constraint
        //nodeval becomes the max for left side  for right its the right side
        // end cases are of null and min and max 

        return valid(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    public boolean valid(TreeNode node,long min, long max){
        if(node == null){
            return true;
        }
        if(node.val<=min || node.val>=max){
            return false;
        }
        
        boolean left = valid(node.left,min,node.val);
        boolean right = valid(node.right,node.val,max);

        return (left && right);
    }
}// Time complexity is O(n)
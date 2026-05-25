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
 *    }
 * }
 */
class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        // make 2 functions of left and right and change the things accordingly 
        if(root == null ){
            return 0;
        }
        return rightside(root.right) + leftside(root.left);
        
    }
    public int rightside(TreeNode t){

        if(t==null){
            return 0;
        }
        
        int left=0;
        int right=0;
        
        if(t.left!=null){
            left = leftside(t.left);
        }
        if(t.right!=null){
            right = rightside(t.right);
        }
        if(t.left==null && t.right==null){
            return 0;
        }
        return left+right;
    }
    public int leftside(TreeNode t){
        if(t==null){
            return 0;
        }
        
        int left=0;
        int right=0;
        
        if(t.left!=null){
            left = leftside(t.left);
        }
        if(t.right!=null){
            right = rightside(t.right);
        }
        if(t.left==null && t.right==null){
            return t.val;
        }
        return left+right;
    }
}// Time complexity O(n)
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
    public int path(TreeNode node,int min){
        // The logic of the question is simple traverse through depth and check keep counting until the leaf nodes 
        // if u get an null to one side just dont go there 
        // check over the assigning values of left and right
        int right=Integer.MAX_VALUE;
        int left=Integer.MAX_VALUE;
        if(node.left==null && node.right==null){
            return min;
        }
        else if(node.left==null && node.right!=null){
           right= path(node.right,min+1);
        }
        else if(node.right==null&& node.left !=null){
            left = path(node.left,min+1);
        }
        else{
          right=  path(node.right,min+1);
          left =  path(node.left,min+1);

        }
        return Math.min(left, right);
    }
    public int minDepth(TreeNode root) {
        if(root==null){
            return 0;
        }

        int ans = path(root,1);
        return ans;
        
    }
}// Time complexity is O(n)
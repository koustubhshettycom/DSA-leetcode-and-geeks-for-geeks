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
        public boolean hasPathSum(TreeNode root, int targetSum) {
            // easy dfs traversal have a note of sum and return it matches or not
            if(root==null){
                return false;
            }
            
        return solve(root,0,targetSum);
        
        }
        public boolean solve(TreeNode root,int sum, int tgt){
            if(root==null){
                return false;
            }
            sum+= root.val;
            if(root.left==null && root.right==null){
                return sum== tgt;
            }
            boolean left = solve(root.left,sum,tgt);
            boolean right = solve(root.right,sum,tgt);

            return left || right;
        }
    }//Time complexity is O(n)
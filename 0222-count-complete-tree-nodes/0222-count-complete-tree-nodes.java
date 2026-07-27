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
    int count;
    public int countNodes(TreeNode root) {
        //Easy logic use dfs and keep a global variable and save
        ans(root);
        return count;
    }
    public void ans(TreeNode root){
        if(root==null){
            return;
        }
        count++;
        ans(root.left);
        ans(root.right);
    }
}
//Time complexity is O(n)
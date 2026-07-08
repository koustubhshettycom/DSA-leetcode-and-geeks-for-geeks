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
    public int maxDepth(TreeNode root) {
        // easy logic of dfs
        if(root==null){
            return 0;
        }
        if(root.left==null && root.right==null){
            return 1;
        }

        int ans = depth(root,0);
        return ans;
    }
    public int depth(TreeNode node, int sum){

        sum+=1;
        int right=sum;
        int left=sum;

        if(node.left!=null){
           left = depth(node.left,sum);
        }
        if(node.right!=null){
           right = depth(node.right,sum);
        }

        return Math.max(left,right);

    }
}// Time complexity is O(n)
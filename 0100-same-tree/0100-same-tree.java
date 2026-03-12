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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // easy logic traverse through each node and check on endcases 
        // use or operator as if there is any false then u can handle them 
        if(p==null || q==null){
            return p==q;
        }

        boolean leftnode = isSameTree(p.left,q.left);
        boolean rightnode = isSameTree(p.right,q.right);

        return leftnode && rightnode && p.val == q.val;
        
    }
}
//Time complexity is O(n)
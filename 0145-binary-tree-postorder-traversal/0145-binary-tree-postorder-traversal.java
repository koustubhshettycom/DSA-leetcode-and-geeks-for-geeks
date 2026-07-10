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
    List<Integer> arr = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        // easy logic post ordere traversal == left->right->current
        run(root);
        return arr;
        
    }

    public void run(TreeNode node){
        if(node==null){
            return;
        }
        run(node.left);
        run(node.right);
        arr.add(node.val);
        return;
    }
}// Time compelxoty is O(n)
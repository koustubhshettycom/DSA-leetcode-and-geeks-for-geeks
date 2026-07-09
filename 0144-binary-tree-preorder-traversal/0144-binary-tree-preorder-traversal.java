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
    public List<Integer> preorderTraversal(TreeNode root) {
        //easy logic preorder add->left->right
        preorder(root);
        return arr;
        
    }
    public void preorder(TreeNode node){
        if(node==null){
            return;
        }
        arr.add(node.val);
        preorder(node.left);
        preorder(node.right);
        return;
    }
}// Time complexity is O(n)
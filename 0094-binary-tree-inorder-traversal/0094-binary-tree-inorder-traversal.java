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
    public List<Integer> inorderTraversal(TreeNode root) {
        //easy logic inorder == left->curr->right

        run(root);
        return arr;
        
    }
    public void run(TreeNode node){
        if(node==null){
            return;
        }
        run(node.left);
        arr.add(node.val);
        run(node.right);
        return;
    }
}//Time complexity is O(n)
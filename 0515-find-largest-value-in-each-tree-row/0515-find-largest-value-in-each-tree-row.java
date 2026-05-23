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
    public List<Integer> largestValues(TreeNode root) {
        Queue<TreeNode> qu = new LinkedList<>();
        List<Integer> list = new LinkedList<>();
        // Logic is to iterate via bfs and check and add the max val in each level
        
        if(root==null){
            return list;
        }
        qu.offer(root);
        while(!qu.isEmpty()){
            int max=Integer.MIN_VALUE;
            int n = qu.size();
            for(int i=0;i<n;i++){
               TreeNode curr = qu.poll();
               if(curr.left!=null){
                qu.offer(curr.left);
               }
               if(curr.right!=null){
                qu.offer(curr.right);
               }
               if(curr.val>=max){
                max = curr.val;
               }

            }
            list.add(max);
        }
        return list;
        
    }
}// Time complexity is O(n)
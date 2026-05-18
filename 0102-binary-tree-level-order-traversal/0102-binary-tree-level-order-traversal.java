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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        // Logic is to make a queue and add the root first the remove the root and add its children do it until the queue is empty

        if(root==null){
            return ans;
        }

        Queue<TreeNode> qu = new LinkedList<>();

        qu.offer(root);

        while(!qu.isEmpty()){
            int size = qu.size();
            ArrayList<Integer> join = new ArrayList<>(size);
            for(int i=0;i<size;i++){
                TreeNode node = qu.poll();
                join.add(node.val);
                if(node.left!= null){
                    qu.offer(node.left);
                }
                if(node.right!= null){
                    qu.offer(node.right);
                }
            }
            ans.add(join);

        }
        return ans;

        
    }
}//Time complexity is O(n)
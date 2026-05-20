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
    public List<Double> averageOfLevels(TreeNode root) {
        //normal traversal through level and then the addition of the level then taking the the avg and then adding it to the list

        

        Queue<TreeNode> qu = new LinkedList<>();
        List<Double> list = new LinkedList<>();
        if(root==null){
            return list;
        }
        qu.offer(root);
        while(!qu.isEmpty()){
            int len = qu.size();
            double sum=0.0;
            for(int i=0;i<len;i++){
                TreeNode curr = qu.poll();
                sum+=curr.val;
                if(curr.left!=null){
                    qu.offer(curr.left);
                }
                if(curr.right!=null){
                    qu.offer(curr.right);
                }
            }
            sum/=len;
            list.add(sum);
        }
        return list;

        
    }
}// Time complextiy is O(n)
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
    public int maxLevelSum(TreeNode root) {

//Easy logic same as of bfs traversal but add the node's value as u traverse through the tree
// compare the value of max total sum and then return it

        if(root==null){
            return 0;
        }
        int count =0;
        int maxcount=0;
        int sum=0;
        int maxsum=Integer.MIN_VALUE;
        Queue<TreeNode> tree = new LinkedList<>();

        tree.offer(root);
        while(!tree.isEmpty()){
            count++;
            sum=0;
            int len = tree.size();
            for(int i=0;i<len ;i++){
                TreeNode curr =tree.poll();
                sum+= curr.val;

                if(curr.left!=null){
                    tree.offer(curr.left);
                }
                if(curr.right!=null){
                    tree.offer(curr.right);
                }
            }
            if(sum>maxsum){
                maxsum=sum;
                maxcount=count;
            }
        }
        return maxcount;

        
    }
}
//Time complexity is O(n)
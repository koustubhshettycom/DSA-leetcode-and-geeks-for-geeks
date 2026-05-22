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
    public List<Integer> rightSideView(TreeNode root) {
        // bfs logic add the last node of each level into the list and get the answer 
        List<Integer> list = new ArrayList<>();
        Queue<TreeNode> qu = new LinkedList<>();
        if(root==null){
            return list;
        }
        qu.offer(root);


        while(!qu.isEmpty()){
            int n= qu.size();
            for(int i=0;i<n;i++){
                TreeNode curr = qu.poll();
                if(curr.left!=null){
                    qu.offer(curr.left);
                }
                if(curr.right!=null){
                    qu.offer(curr.right);
                }

                if(i==n-1){
                    list.add(curr.val);
                }

            }

        }
        return list;
        
    }
}// Time complexity is O(n)
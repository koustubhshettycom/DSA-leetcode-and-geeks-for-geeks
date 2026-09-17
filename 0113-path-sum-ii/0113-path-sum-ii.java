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
    //Easy logic maintain a list of list and and elements when sum == target 
    // using dfs mainly and used backtracking before return;
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<Integer> curr = new ArrayList<>();
        solve(root,targetSum,0,curr);
        return ans;
    }
    public void solve(TreeNode root, int target,int sum,List<Integer> curr){
        if(root==null){
            return ;
        }
        sum+= root.val;
        curr.add(root.val);
        if(root.left==null && root.right==null ){
            if(target==sum){
                ans.add(new ArrayList<>(curr));
            }
            curr.remove(curr.size()-1);
            return;
        }
        if(root.left!=null){
            solve(root.left,target,sum,curr);
        }
        
        if(root.right!=null){
            solve(root.right,target,sum,curr);
        }
        curr.remove(curr.size()-1);
        return ;
    }
}//Time complexity is O(n)
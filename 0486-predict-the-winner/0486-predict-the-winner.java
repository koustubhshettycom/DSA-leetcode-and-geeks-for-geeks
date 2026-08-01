class Solution {
    Integer[][] dp;
    public boolean predictTheWinner(int[] nums) {
        // hard logic even tho recursion is easily attained 
        // p1 - p2 is calculated in every step if u get -ve the player cant win
        //as u need to consider anyway p1 can win
        // use of dp+recursion index for dp is left and right as they r changing
        dp = new Integer[nums.length][nums.length];
       if( solve(nums,0,nums.length-1)>=0){
        return true;
       }
       return false;
    }
    public int solve(int[] arr, int left, int right){
        if(left==right){
            return arr[left];
        }

        if(dp[left][right]!=null){
            return dp[left][right];
        }
        int l = arr[left] - solve(arr,left+1,right);
        int r = arr[right] - solve(arr,left,right-1);
        dp[left][right] = Math.max(l,r);
        return dp[left][right];
    }
}// Time complexity is O(n*n)
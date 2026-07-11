class Solution {
    int[] dp;
    public int rob(int[] nums) {
        //Logic is of recursion optimising it w dp
        // start from 0 or 1 idx then choose the best acc to question
        dp = new int[nums.length+1];
        Arrays.fill(dp,-1);
        
        return Math.max(solve(nums,1),solve(nums,0));
    }
    public int solve(int[] arr, int i){
        if(i>=arr.length){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        dp[i] = Math.max(arr[i]+solve(arr,i+2),arr[i]+solve(arr,i+3));

        return dp[i];
    }
}//Time complexity is O(n)
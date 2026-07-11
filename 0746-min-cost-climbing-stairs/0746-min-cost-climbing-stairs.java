class Solution {
    int[] dp;
    public int minCostClimbingStairs(int[] cost) {

        // the logic is of recursion but we use dp to make it optimal
        //u either take 1 step or 2 steps and record them in dp so tht u dont repeat steps
        
        dp = new int[cost.length];
        Arrays.fill(dp,-1);
        return Math.min(solve(cost,0),solve(cost,1));


    }
    public int solve(int[] arr,int idx){
        if(idx>=arr.length){
            return 0;
        }
        if(dp[idx]!=-1){
            return dp[idx];
        }
        
        dp[idx] =arr[idx]+ Math.min(solve(arr,idx+1),solve(arr,idx+2));
        return dp[idx];
    }
}//Time complexity is O(n)
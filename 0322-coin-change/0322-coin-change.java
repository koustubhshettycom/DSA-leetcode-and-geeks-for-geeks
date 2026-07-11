class Solution {
    int[] dp;
    public int coinChange(int[] coins, int amount) {
        // hard logic but easy recursion standard template of dp
        // implementation of dp is hard choosing of index is important
        // go till the end and return the basic number 
        // for a dp index value check the min recursed val of all the ele of coins 
        // choose the least among them check for the base and other conditions too
        // return it with the checked case of -1 or not
        if(amount==0){
            return 0;
        }
        dp = new int[amount+1];
        
        Arrays.fill(dp,-1);
        
        int min = Integer.MAX_VALUE;
        for(int i=0;i<coins.length;i++){
            int ans = Math.min(min,solve(coins,amount-coins[i]));
            if(ans!=Integer.MAX_VALUE){
                min = Math.min(min,ans+1);
            }
        }
        if(min==Integer.MAX_VALUE){
            return -1;
        }
        return min;
        
    }
    public int solve(int[] arr, int amt){
        int min = Integer.MAX_VALUE;
        if(amt==0){
            return 0;
        }
        if(amt<0){
            return Integer.MAX_VALUE;
        }
        if(dp[amt]!=-1){
           return dp[amt];
        }
        
        
        for(int i=0;i<arr.length;i++){
            
            int ans = solve(arr,amt-arr[i]);
            if(ans!=Integer.MAX_VALUE){
                min = Math.min(min,ans+1);
            }
            
            
        }
        dp[amt]=min;
        return min;
    }
}// Time complexity is O(n*amount)
class Solution {
    int[][] dp;
    public boolean canPartition(int[] arr) {
        //easy logic of recursion optimising with dp
        // adding dp is the harder part where u need to choose if its 1D/2D
        // as here the index and the sum are varying take 2D
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        if(sum%2!=0){
            return false;
        }
        else{
            sum/=2;
        }
        dp = new int[arr.length+1][sum+1];
        for(int row[]:dp){
            Arrays.fill(row,-1);
        }
       
        int n = solve(arr,sum,0);
        if(n==1){
            return true;
        }
        return false;
        
    }
    public int solve(int[] arr,int sum,int idx){
        if(sum<0){
            return 0;
        }
        if(sum==0){
            return 1;
        }
        if(idx==arr.length){
            return 0;
        }
        if(dp[idx][sum]!=-1){
            return dp[idx][sum];
        }
           

        dp[idx][sum]=Math.max(solve(arr,sum,idx+1),solve(arr,sum-arr[idx],idx+1));

        return dp[idx][sum];

    }
}// Time complexity is O(k*m) k is constant 
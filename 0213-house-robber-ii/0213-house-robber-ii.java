class Solution {
    Integer[] dp;
    public int rob(int[] nums) {
        // logic is to eliminate the first or last element from the start 
        // use recursion+memory i.e dp 
        //cases are either add or ignore if added skip to +2
        if(nums.length==1){
            return nums[0];
        }
        dp = new Integer[nums.length];

        int left = solve(0,nums,nums.length-2);
        dp = new Integer[nums.length];
        int right = solve(1,nums,nums.length-1);
        return Math.max(left,right);

       
    }
    public int solve(int idx,int[] arr,int end ){
        
        if(idx>end){
            return 0;
        }
        
        if(dp[idx]!=null){
            return dp[idx];
        }
        int left = solve(idx+1,arr,end);
        int right = arr[idx]+solve(idx+2,arr,end);

        dp[idx]= Math.max(right,left);

        return dp[idx];

    }
}//Time complexity is O(n)
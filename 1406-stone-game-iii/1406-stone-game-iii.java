class Solution {
    Integer dp[];
    public String stoneGameIII(int[] stoneValue) {
    // Logic is to minus the opps best move of 3 indexes
    // its a easy recursion and dp logic 1d dp is chosen as only 1p is considered
        dp = new Integer[stoneValue.length];
        int n = solve(stoneValue,0);
        if(n==0){
            return "Tie";
        }
        else if(n>0){
            return "Alice";
        }
        else{
            return "Bob";
        }
        
    }
    public int solve(int[] arr,int idx){
        if(idx==arr.length){
            return 0;
        }
        if(dp[idx]!=null){
            return dp[idx];
        }
        int player =0;
       
        
        int max=Integer.MIN_VALUE;
       for(int i=idx;i<Math.min(arr.length,idx+3);i++){
       player+=arr[i];
        max = Math.max(max,player-solve(arr,i+1));
       }

        dp[idx] = max;
        return max;

    }
}//Time complexity is O(n)
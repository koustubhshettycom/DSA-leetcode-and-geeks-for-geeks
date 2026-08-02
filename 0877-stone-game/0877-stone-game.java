class Solution {
    Integer dp[][];
    public boolean stoneGame(int[] arr) {
        //Easy logic similar to lc 486 =>(p1-p2) if its greater than 0 then true
        dp = new Integer[arr.length][arr.length];
        if(solve(arr,0,arr.length-1)>0){
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
}//Time complexity is O(n*n)
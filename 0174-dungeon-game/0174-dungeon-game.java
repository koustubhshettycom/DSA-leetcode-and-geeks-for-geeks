class Solution {
    Integer[][] dp;
    public int calculateMinimumHP(int[][] arr) {
        // hard logic use recursion+ memorization 
        // go left or right in the end u have to return 1(if path has only +ve)
        // or return the min value which is -ve ie(1-(-minval)) so u get a +ve val
        //if u get better one update it and return [1 or minval]
        //return positive val of min +1 or 1 by Math.max(1,1-ans)
        
        if(arr[0].length==1 && arr.length==1 ){
            return Math.max(1,1-arr[0][0]);
        }
        dp = new Integer[arr.length][arr[0].length];
        int ans = solve(arr,0,0);
        
        return ans;
    }
    public int solve(int[][] arr,int row,int col){
        

        if(row>=arr.length || col>=arr[0].length){
            return Integer.MAX_VALUE;
        }

        

        if(row==arr.length-1 && col== arr[0].length-1){
         return  Math.max(1,1-arr[row][col]);
          
        }
        if(dp[row][col]!=null ){
            return dp[row][col];
        }
        int right = Integer.MIN_VALUE;
        int down = Integer.MIN_VALUE;
        

        
        right = solve(arr,row,col+1);
        
        
        down = solve(arr,row+1,col);
        
        int ans = Math.min(right,down);
        
        
        dp[row][col] = Math.max(1,ans-arr[row][col]);
        
        return dp[row][col];
    }
}//Time complexity is O(n*n)
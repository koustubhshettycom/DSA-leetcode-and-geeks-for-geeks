class Solution {
    //Easy logic of dp recursion left right and  mid of saved return it 
    // tc of the end cases that is out of bounds
    Integer[][] dp;
    public int minFallingPathSum(int[][] matrix) {
        int  n = matrix.length;
        dp = new Integer[n][n];
        int m = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            m = Math.min(m,solve(0,i,matrix));
        }
        return m;
        
    }
    public int solve (int row ,int col,int[][] arr){
        if(row>=arr.length){
            return 0;
        }
        if(dp[row][col]!=null){
            return dp[row][col];
        }

        int left = Integer.MAX_VALUE;
        int mid = Integer.MAX_VALUE;
        int right = Integer.MAX_VALUE;

        
        if(col-1>=0 && col-1<arr.length){
            
         left = solve(row+1,col-1,arr);
            
        }
        if(col>=0 && col<arr.length){
            
            mid = solve(row+1,col,arr);
            
        }
        if(col+1>=0 && col+1<arr.length){
            right = solve(row+1,col+1,arr);
        }

        dp[row][col]= arr[row][col]+Math.min(mid,Math.min(right,left));

        return dp[row][col];
        

    }
}//Time complexity is O(n*n)
class Solution {
    Integer[][][] dp ;
    public int minCost(int[][] grid){
        //tough logic misleading for 2d recursion
        //The reason to use 3D dp as the prev ans affects the future one
        //Like even the max ans later may affect the future one
        
        int m= grid.length;
        int n = grid[0].length;
        dp = new Integer[m][n][1024];
        return solve(grid,m,n,0,0,0);
        
    }
    public int solve(int[][] grid,int m,int n,int r,int c,int ans){
        if(r==m-1 && c==n-1){
            return ans^=grid[r][c];
        }
        if(r>=m){
            return Integer.MAX_VALUE;
        }
        if(c>=n){
            return Integer.MAX_VALUE;
        }
        if(dp[r][c][ans]!=null){
            return dp[r][c][ans];
        }
        int right = solve(grid,m,n,r,c+1,ans^grid[r][c]);
        int down = solve(grid,m,n,r+1,c,ans^grid[r][c]);

        dp[r][c][ans] = Math.min(down,right);
        return dp[r][c][ans];
    }
}//Time complexity is O(n*n*1024)
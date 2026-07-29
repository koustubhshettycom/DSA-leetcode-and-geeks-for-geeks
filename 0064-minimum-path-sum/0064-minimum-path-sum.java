class Solution {
    // easy and normal logic of dp and recursion
    public int minPathSum(int[][] grid) {
        int[][] dp = new int[grid.length][grid[0].length];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        return way(grid,0,0,dp);

    }
    public int way(int[][] grid, int x,int y,int[][]dp){
        if(x>=grid.length || y>=grid[0].length){
            return Integer.MAX_VALUE;
        }
        if(x == grid.length-1 && y == grid[0].length-1){
            return grid[x][y];
        }
        if(dp[x][y]!=-1){
            return dp[x][y];
        }
        int row = way(grid,x+1,y,dp);
        int col = way(grid,x,y+1,dp);
        dp[x][y] =grid[x][y] + Math.min(row,col);
        return dp[x][y];
    }
}//Time complexity is O(n*m)
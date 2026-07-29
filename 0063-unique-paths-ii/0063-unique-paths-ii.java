class Solution {
    
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        //easy logic of recursion and dp 
       int[][] dp = new int[obstacleGrid.length][obstacleGrid[0].length];
       for(int[] row : dp){
        Arrays.fill(row,-1);
       }
       
       return way(obstacleGrid,0,0,dp);
    
    }
    public int way(int[][] grid,int x, int y ,int[][] dp){
        if(x>=grid.length || y>=grid[0].length || grid[x][y]==1){
            return 0;
        }
        if(x==grid.length-1 && y==grid[0].length-1){
            
            return 1;
        }
        
        if(dp[x][y]!=-1){
            return dp[x][y];
        }
        int left = way(grid,x+1,y,dp);
        int right = way(grid,x,y+1,dp);
        dp[x][y] = left+right;
        return dp[x][y];
    }
}//Time complexity is O(n*m)
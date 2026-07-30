class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        //easy logic take care of the endcases ie the triangle size
        // use recursion + memorization (dp)
    int[][] dp = new int[triangle.size()][triangle.size()];
    for(int[] row: dp){
        Arrays.fill(row,Integer.MAX_VALUE);
    }
    return way(triangle,0,0,dp);
    
    }
    public int way(List<List<Integer>> triangle,int x,int y, int[][] dp){
        if(x==triangle.size()-1){
            return triangle.get(x).get(y);
        }
        if(dp[x][y]!=Integer.MAX_VALUE){
            return dp[x][y];
        }
        int left = way(triangle,x+1,y,dp);
        int right = way(triangle,x+1,y+1,dp);

        dp[x][y] = Math.min(left,right)+triangle.get(x).get(y);

        return dp[x][y];
    }
}// Time complexity is O(n)
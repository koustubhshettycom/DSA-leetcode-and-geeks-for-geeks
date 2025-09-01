class Solution {
    public int countNegatives(int[][] grid) { 
      
      int count=0;
      for(int row=0;row<grid.length;row++){
        int end=grid[row].length-1;
        while(end>=0 && grid[row][end]<0 ){
            end--;
            count++;
        }
        

      }
      return count;  
    }
}
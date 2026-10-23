class Solution {
    
    public int[] lastVisitedCell(char[][] grid) {
        //Easy logic go according to the question grid and iterate 
        // send the final coordinates 
        int[] arr = new int[2];
        boolean[][] tt = new boolean[grid.length][grid[0].length];
        
        return solve(0,0,grid,arr,tt);
        
    }
    public int[] solve(int r,int c,char[][] grid,int[] arr,boolean[][] tt){
        if(r<0 || c<0 || r>=grid.length || c>=grid[0].length|| tt[r][c]== true){
            return arr;
        }
        arr[0] = r;
        arr[1] = c;
        tt[r][c] = true;

        if(grid[r][c]=='D'){
            solve(r+1,c,grid,arr,tt);
        }
        else if(grid[r][c]=='U'){
            solve(r-1,c,grid,arr,tt);
        }
        else if(grid[r][c]=='L'){
            solve(r,c-1,grid,arr,tt);
        }
        else{
            solve(r,c+1,grid,arr,tt);
        }

        return arr;
    }

}//Time complexity is O(n*n)
class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        // logic is to save the grid values wrt their indexes such that u can access them
        // check repetition and missing cases 
        int[] ans = new int[2];
        
        int row = grid.length;
        int n = row;
        int[] arr = new int[n*n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int val = grid[i][j];
                arr[val-1]+=1;
            }
        }
        for(int i=0;i<n*n;i++){
            if(arr[i]==2){
                ans[0]=i+1;
            }
             if(arr[i]==0){
                ans[1]=i+1;
            }
        }
        return ans;
        

    }
}// Time Complexity is O(n*n)
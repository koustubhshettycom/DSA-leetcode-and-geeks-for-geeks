class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        // Assign the values to the matrix then based on the values of commands add or minus 
        int[][] arr = new int[n][n];
        int num=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=num;
                num++;
            }
        }
        int row =0;
        int col =0;

        for(String x:commands){
            if(x.equals("DOWN")){
                row++;
            }
            if(x.equals("RIGHT")){
                col++;
            }
            if(x.equals("UP")){
                row--;
            }
            if((x.equals("LEFT"))){
                col--;
            }

        }
        return arr[row][col];
        
    }
}// Time Complexity O(n)
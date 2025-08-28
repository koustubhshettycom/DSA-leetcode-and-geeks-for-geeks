class Solution {
    public void setZeroes(int[][] arr) {
       int n= arr.length;
       int m= arr[0].length;
       // declaring the idexes with 0
        boolean[] row = new boolean[n];
        boolean[] col = new boolean[m];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==0){
                    row[i]=true;
                    col[j]=true;
                }
            }
        }
        // updating the index later on
        for(int i=0;i<arr.length;i++){
           for(int j=0;j<arr[0].length;j++){
            if(row[i] || col[j]){
                arr[i][j]=0;
            }
           } 
        }

    }
} // Time complexity is great O(n*n) 8/10
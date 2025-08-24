class Solution {
    public int diagonalSum(int[][] mat) {
        int sum =0;
        //primary diagonal
        for(int i=0;i<mat.length;i++){
          sum+= mat[i][i]; 
        }



        // secondary diagonal
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++)
                if(i+j==mat.length-1 && i!=j){
                    sum+= mat[i][j];
                }
            
        }
        return sum;
        
    }
}
// time complexity is not that good O(n*n) 6/10 


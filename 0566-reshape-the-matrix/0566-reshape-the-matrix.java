class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
     int[] num= new int[r*c];
     int count=0;
     if(mat.length*mat[0].length != r*c){
        return mat;
     }
     for(int i=0;i<mat.length;i++){
        for(int j=0;j<mat[i].length;j++){
           num[count++] = mat[i][j];
        }
     }
     int idk =0;
     int[][] arr =new int[r][c];
     for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
            arr[i][j]=num[idk++];
        }
     }
     return arr;


    }
}
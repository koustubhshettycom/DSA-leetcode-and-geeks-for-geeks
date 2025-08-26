class Solution {
    int num=1;
    void fillmatrix(int[][] arr, int startrow,int startcol,int endrow,int endcol){
        
        if(startrow > endrow || startcol > endcol){
            return ;
        }
        
        for(int i=startcol;i<=endcol;i++){
            arr[startcol][i]=num;
            num++;
        }
        for(int i = startrow + 1; i <= endrow; i++){
            arr[i][endcol]=num;
            num++;
        }
        if(startrow<endrow){
            for(int i = endcol - 1; i >= startcol; i--){
                arr[endrow][i]=num++;
            }
        }
        if(startcol<endcol){
           for(int i = endrow - 1; i > startrow; i--){
            arr[i][startcol]=num;
             num++;
           } 
        }
        fillmatrix( arr,  startrow+1, startcol+1, endrow-1, endcol-1);
        return;
    }
    public int[][] generateMatrix(int n) {
        int[][] arr =new int[n][n];
        int num=1;
        fillmatrix(arr,0,0,n-1,n-1);
        return arr;


    }
}
class Solution {
    public void rotate(int[][] arr) {
        // Easy logic transpose and then reverse each row
        // take care of the transposing part j=i+1

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        for(int i=0;i<arr.length;i++){
            int start=0;
            int end = arr.length-1;
            while(start<end){
               int temp = arr[i][start];
               arr[i][start] = arr[i][end];
               arr[i][end]=temp;
               start++;
               end--;
            }
        }
        return ;

        
    }
}// Time compelxity is O(n*n)
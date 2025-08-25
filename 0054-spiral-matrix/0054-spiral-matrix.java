class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        int startrow=0;
        int startcol=0;
        int endrow=arr.length-1;
        int endcol=arr[0].length-1;
        List<Integer> ll = new ArrayList<>();
        spiral(arr, 0, arr.length - 1, 0, arr[0].length - 1, ll);
        return ll;

// used recursion and while loops if condition for last two to check the row and col




    }
    
        public void spiral(int[][] arr, int startrow,int endrow,int startcol,int endcol,List<Integer> ll){
          // end condition needed to check if it overlaps the matrix again
            if(startrow > endrow || startcol > endcol ){
                return ;
                
            }
            int row=startrow;
            int col=startcol;
            // top row
            while(col<=endcol){
                    ll.add(arr[row][col]);
                    col++;
                }
            col--;row++; // correcting the index for the next loop
            // right col
            while(row<=endrow){
                    ll.add(arr[row][col]);
                    row++;   
            }
            // correcting the index for the next loop
            row--;col--;
            //bottom row
            //base conditionn not to repeat 
            if (startrow < endrow)  {
             while (col >= startcol) {
               ll.add(arr[row][col]);
                 col--;
                 }
                 // correcting the index for the next loop
                 col++; row--;  
            }
            // top left
            //checking the base condition
            if(startcol < endcol){
                 while (row > startrow) {
                  ll.add(arr[row][col]);
                  row--;
                    }
                }
                

            
               // using recursion to for the inner loops 
                spiral( arr, startrow+1, endrow-1, startcol+1, endcol-1,ll);
            }

            
        
        // Time complexity is great and good job at your first medium question O(m*n) 10/10
}
class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        int startrow=0;
        int startcol=0;
        int endrow=arr.length-1;
        int endcol=arr[0].length-1;
        List<Integer> ll = new ArrayList<>();
        spiral(arr, 0, arr.length - 1, 0, arr[0].length - 1, ll);
        return ll;






    }
    
        public void spiral(int[][] arr, int startrow,int endrow,int startcol,int endcol,List<Integer> ll){
            
            if(startrow > endrow || startcol > endcol ){
                return ;
                
            }
            int row=startrow;
            int col=startcol;

            while(col<=endcol){
                    ll.add(arr[row][col]);
                    col++;
                }
            col--;row++;

            while(row<=endrow){
                    ll.add(arr[row][col]);
                    row++;   
            }
            row--;col--;
            if (startrow < endrow)  {
             while (col >= startcol) {
               ll.add(arr[row][col]);
                 col--;
                 }
                 col++; row--;  
            }

            if(startcol < endcol){
                 while (row > startrow) {
                  ll.add(arr[row][col]);
                  row--;
                    }
                }
                

            
            
                spiral( arr, startrow+1, endrow-1, startcol+1, endcol-1,ll);
            }

            
        
        
}
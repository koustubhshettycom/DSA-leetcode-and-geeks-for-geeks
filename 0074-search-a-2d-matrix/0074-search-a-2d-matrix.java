class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
        // have a start and end index and use binary search in 2d
       int startrow =0;
       int startcol=0;
       int endrow=arr.length-1;
       int endcol =arr[0].length-1;
       
       while(startrow<=endrow && startcol<=endcol){
        int midrow= startrow + (endrow-startrow)/2;
        int midcol = startcol + (endcol-startcol)/2;
        int midval =arr[midrow][midcol];
        if(midval==target){
            return true;
        }
        if(midval<target){
           if(arr[midrow][arr[0].length-1]<target){
            startcol=0;
            startrow=midrow+1;
           }
           else{
            startcol=midcol+1;
           }
        }
       
        if(midval>target){
            if(arr[midrow][0]>target){
               endcol=arr[0].length-1; 
               endrow=midrow-1; 
            }
            else{
               endcol=midcol-1;
            }
        }

       }
       return false; 
    }
}// Time complexity is O(n*n)
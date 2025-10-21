class Solution {
    public int heightChecker(int[] heights) {
     // create an seperate array for compaaring 
     // compare and add if anycase of mismatch
     int[] arr = Arrays.copyOf(heights, heights.length);
     // this is also important Arrays.copyof()
     Arrays.sort(heights) ;
     int count=0;
     for(int i=0;i<arr.length;i++){
        if(heights[i]!= arr[i]){
            count++;
        }
     }
     return count;
    }
}
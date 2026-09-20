class Solution {
    public int countIntersectingIntervals(int[][] arr) {
        //Easy logic if there is overlap then the min of 2 end 
        //is greater than the max of 2 start 
        int count =0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int start = Math.max(arr[i][0],arr[j][0]);
                int end = Math.min(arr[i][1],arr[j][1]);

                if(start<=end){
                    count++;
                }
            }
        }
        return count;
    }
}//Time complexity is O(n*n)
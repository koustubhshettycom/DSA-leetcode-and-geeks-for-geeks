class Solution {
    public int maxArea(int[] arr) {
        // easy logic the max area is to be founded
        // the area of water works considering the min side and diff of index
        int max = Integer.MIN_VALUE;
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int area = Math.min(arr[end],arr[start])*(end-start);
            max = Integer.max(area,max);

            if(arr[end]<arr[start]){
                end--;
            }
            else{
                start++;
            }
        }
        return max;
        
    }
}//Time complexity is O(n)
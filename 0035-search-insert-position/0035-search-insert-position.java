class Solution {
    public int searchInsert(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        // it was given sorted array and time complexity required to be logn 
        // so binary search was the right approach
        while(start<=end){
            int mid = start + (end -start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }
            if(target>arr[mid]){
                start=mid+1;
            }
            if(target==arr[mid]){
                return mid;
            }
        }
       return start; 
    }
} // Time complexity is not a problem O(logn) 10/10
class Solution {
    public int findMin(int[] nums) {
       int start=0;
       int end=nums.length-1;
       // if array is sorted 
       if(nums[0]<=nums[nums.length-1]){
            return nums[0];
        }// binary search      
       while(start<end){
        int mid= start+(end-start)/2;
        
       // plan to search with the end element with mid
        if(nums[mid]>nums[end]){
            start=mid+1;
        }
        // same plan keep elminating elements
        if(nums[mid]<nums[end]){
            end=mid;
        }
       } 
       return nums[start];
    }
}// Time complexty is good O(logn)
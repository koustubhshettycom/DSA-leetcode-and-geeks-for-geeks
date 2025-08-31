class Solution {
    public int findMin(int[] nums) {
       int start=0;
       int end=nums.length-1;
       if(nums[0]<=nums[nums.length-1]){
            return nums[0];
        }      
       while(start<end){
        int mid= start+(end-start)/2;

       
        if(nums[mid]>nums[end]){
            start=mid+1;
        }
        if(nums[mid]<nums[end]){
            end=mid;
        }
       } 
       return nums[start];
    }
}
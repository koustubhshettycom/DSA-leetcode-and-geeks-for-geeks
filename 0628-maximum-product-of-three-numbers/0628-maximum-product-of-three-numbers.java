class Solution {
    public int maximumProduct(int[] nums) {
        // the logic is to sort the arrays 
        // there are three cases for this code check that one by one
        // there can br other solution of taking first 2 and last 2 later compare
     Arrays.sort(nums);// here u can use any other manual sorting methods also 
     int size = nums.length;
     int neg =1;
     int pos =1;
     if(nums[0]<0 && nums[1]<0 && nums[size-1]>0){
        if(nums[0]*nums[1]>nums[size-3]*nums[size-2]){
            return nums[0]*nums[1]*nums[size-1];
        }
        else{
            return nums[size-2]*nums[size-3]*nums[size-1];
        }
     }
     else if(nums[0]<0 && nums[1]<0 && nums[size-1]<0){
        return nums[size-2]*nums[size-3]*nums[size-1];
     }
     else{
        return nums[size-2]*nums[size-3]*nums[size-1];
     }
    }
} //Time complexity is O(nlogn)
class Solution {
    public int search(int[] nums, int target) {
        // as its sorted array usage of binary search is used and
        //the structure goes like if->(if,else) & else->(if,else)
    int low = 0;
    int high = nums.length-1;
    while(low<=high){
        int mid = (low+high)/2;
        if(nums[mid]==target){
            return mid;
        } 
            
        if(nums[low]<=nums[mid]){
            if(target>=nums[low] && target<=nums[mid]){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        else{
            if(target>=nums[mid] && target<=nums[high]){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
    }

        return -1;
    }
}// Time compelxity is O(logn)
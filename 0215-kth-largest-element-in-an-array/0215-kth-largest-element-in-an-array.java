class Solution {
    public int findKthLargest(int[] nums, int k) {
        // sort the array and return the length-k integer 
     Arrays.sort(nums);

     return nums[nums.length-k];
    }
    
}
// Time complexity is O(nlogn) 
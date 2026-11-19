class Solution {
    public int minimizeSum(int[] nums) {
        //the logic is easy as after changing and the sorting part min is 0
        //the max is either of last 3 diff w first 3
        Arrays.sort(nums);
        int n = nums.length;
        return Math.min(nums[n-1]-nums[2],Math.min(nums[n-2]-nums[1],nums[n-3]-nums[0]));
    }
}//Time complexity is O(nlogn)
class Solution {
    public int minMoves2(int[] nums) {
        //Easy logic as u need to find min step for the elements to be equal
        //We use median then diff of every element w median
        Arrays.sort(nums);
        int mid = nums[nums.length/2];
        int ans = 0;
        for(int n:nums){
            ans += Math.abs(n-mid);
        }
        return ans;
    }      
}//Time complexity is O(n)
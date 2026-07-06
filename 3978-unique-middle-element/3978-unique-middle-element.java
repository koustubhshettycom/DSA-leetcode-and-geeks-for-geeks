class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
    // easy logic find the num on mid, remove and store it then traverse and match
        int mid = nums.length/2;
        int num = nums[mid];
        nums[mid] =-1;

        for(int n : nums){
            if(n==num){
                return false;
            }
        }
        return true;
    }
}// Time complexoty is O(n)
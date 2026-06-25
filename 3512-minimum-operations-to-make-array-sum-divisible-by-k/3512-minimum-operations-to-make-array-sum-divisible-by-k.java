class Solution {
    public int minOperations(int[] nums, int k) {
        // easy logic just sum%k
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+= nums[i];
        }

        return sum%k;
        
    }
}// Time complexity is O(n)
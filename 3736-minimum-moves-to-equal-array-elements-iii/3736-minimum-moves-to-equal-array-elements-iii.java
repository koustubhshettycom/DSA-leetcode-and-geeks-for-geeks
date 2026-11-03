class Solution {
    public int minMoves(int[] nums) {
        //Easy logic find the max and the ans is the diff of each with the max
        int max = Integer.MIN_VALUE;
        for(int n:nums){
            max = Math.max(max,n);
        }
        int ans =0;
        for(int n:nums){
            ans+= Math.abs(max-n);
        }
        return ans;
    }
}//Time complexity is O(n)
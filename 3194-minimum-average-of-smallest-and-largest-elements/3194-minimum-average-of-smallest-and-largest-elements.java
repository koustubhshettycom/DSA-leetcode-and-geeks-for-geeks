class Solution {
    public double minimumAverage(int[] nums) {
        //Easy logic
        double min = Double.MAX_VALUE;
        Arrays.sort(nums);
        int start =0;
        int end = nums.length-1;

        while(start<end){
            double avg = (nums[start]+nums[end])/2.0;
            min = Math.min(avg,min);
            start++;end--;

        }
        return min;
    }
}// Time complexity is O(nlogn)
class Solution {
    public int[] buildArray(int[] nums) {
        int size = nums.length;
        int[] arr = new int[size];
        for(int i=0;i<nums.length;i++){
            arr[i] = nums[nums[i]];
        } 
        return arr;
    }
}
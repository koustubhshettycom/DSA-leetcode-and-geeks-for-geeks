class Solution {
    public int[] runningSum(int[] nums) {
        int prev = 0;
        int[] arr = new int[nums.length];
        // having a previous and adding by treversing 
        for(int i=0;i<nums.length;i++){
            prev+= nums[i];
            arr[i]= prev;
        }
        return arr;
    }
}

// time complexity is great O(n) 9/10

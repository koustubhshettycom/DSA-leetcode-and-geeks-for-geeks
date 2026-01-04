class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        // easy logic just add and minus at every recursion call 
        // backtracking is adding left and right that is it 
        
        int p =0;
        int idx =0;
        return sum(nums,target,idx,p);

    }
    public int sum(int[] arr, int target, int idx, int p){
        if (idx == arr.length) {
            if (p == target) {
                return 1;
            } else {
                return 0;
            }
        }

        int count =0;
        int left = sum(arr,target,idx+1,p+arr[idx]);
        int right = sum(arr,target,idx+1,p-arr[idx]);

        count = left + right;
        return count;
    }
}
// Time complexity is O(2^n)
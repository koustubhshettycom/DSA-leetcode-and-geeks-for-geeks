class Solution {
    public int numIdenticalPairs(int[] nums) {
        //Easy logic
    int count = 0;
    int numsSize = nums.length;

    for(int i = 0; i < numsSize - 1; i++) {

        for(int j = i + 1; j < numsSize; j++) {

            if(nums[i] == nums[j]) {
                count++;
            }
        }
    }
    return count;
    }
    
}
//Time complexity is O(n*n)
class Solution {
    public int countConsistent(int[] nums) {
        //Easy logic for every subarray check if the condition is satisfied
        int n = nums.length;
        int count =0;
        for(int i=0;i<n;i++){
            int add = nums[i];
            int min = nums[i];
            for(int j=i;j<n;j++){
                add &= nums[j];
                if(nums[j] < min){
                    min = nums[j];
                }
                if(add==min){
                    count++;
                }
            }
        }

        return count;
    }
}//Time complexity id O(n*n)
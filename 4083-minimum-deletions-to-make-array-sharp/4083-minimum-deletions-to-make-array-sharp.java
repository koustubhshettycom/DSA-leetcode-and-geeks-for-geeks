class Solution {
    public int minDeletions(int[] nums) {
        // Easy logic check for number of adajcent elements
        
        int count =0;

        for(int i=0;i<nums.length;i++){
            if(i==nums.length-1){
                break;
            }
            if(nums[i]==nums[i+1]){
                count++;
            }

        }
        return count;

        
        
    }
}//Time complexity is O(n)
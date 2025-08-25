class Solution {
    public int majorityElement(int[] nums) {
        
        int size = nums.length;
        // for outer loop
       for(int i=0;i<nums.length;i++){
        int count=0;
        // for inner loop
        for(int j=0;j<nums.length;j++){
            if(nums[i]==nums[j]){
                count++;
            }
        }
        if(count>size/2){
                return nums[i];
            }
        
         
       }
       return size;


    }
    // Time complexity is very bad O(n*n) 0/10
    
}
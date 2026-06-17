class Solution {
    public int minimumOperations(int[] nums) {
        // Easy logic 
        int count=0;
        for( int num : nums){
            if(num%3==1 || num%3==2){
                count++;
            }
        }
        return count;
        
    }
}// Time complexity is O(n)
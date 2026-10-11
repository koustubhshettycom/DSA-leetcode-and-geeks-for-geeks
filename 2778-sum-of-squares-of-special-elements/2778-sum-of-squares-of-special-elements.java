class Solution {
    public int sumOfSquares(int[] nums) {
        // Easy logic read the question 
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(nums.length%(i+1)==0){
                sum+= (nums[i]*nums[i]);
            }
        }
        return sum;
        
    }
}//Time complexity is O(n)
class Solution {
    public int differenceOfSum(int[] nums) {
        //Easy logic maintain sum and digitsum and return the diff
        int sum =0;
        int dsum =0;

        for(int i=0;i<nums.length;i++){
            sum+=nums[i];

            int n= nums[i];
            while(n>0){
                dsum+= n%10;
                n = n/10;
            }
        }

        return Math.abs(sum-dsum);
        
    }
}//Time complexity is O(n)
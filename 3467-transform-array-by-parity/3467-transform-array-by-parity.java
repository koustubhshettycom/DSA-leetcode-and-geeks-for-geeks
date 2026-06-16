class Solution {
    public int[] transformArray(int[] nums) {
        // easy logic read the question 
        int even =0;
        int odd =0;

        for( int num: nums){
            if(num%2==0){
                even++;
            }
            else{
                odd++;
            }
        }

        int idx=0;
        while(even>0){
            nums[idx]=0;
            idx++;even--;
        }
        while(odd>0){
            nums[idx]=1;
            idx++;odd--;
        }

        return nums;
        
    }
}// Time complexity is O(n)
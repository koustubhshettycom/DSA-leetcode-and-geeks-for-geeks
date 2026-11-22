class Solution {
    public int countDominantElements(int[] nums) {
        //Easy logic iterate and check the number of elements satisfying the condition
        //Tc of typecasting
        int n = nums.length;
        int count=0;
        if(nums.length==1){
            return 1;
        }
        for(int i=0;i<n;i++){
            if(i==0){
                if(nums[i+1]<=nums[i]){
                    count++;
                }
                continue;
            }
            if(i==n-1){
                if(nums[i-1]<=nums[i]){
                    count++;
                }
                
                continue;
            }
            long avg= (long)Math.ceil((nums[i-1]+(double)nums[i+1])/2);
            if(avg<=nums[i]){
                count++;
            }
        }
        return count;
    }
}//Time complexity is O(n)
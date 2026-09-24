class Solution {
    public int smallestIndex(int[] nums) {
        //Easy logic read the question
        int min = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            int n = nums[i];
            
            int sum =0;
            while(n>0){
                int ans = n%10;
                sum+= ans;
                n = n/10;
            }
            if(sum==i){
                min = Math.min(min,sum);
            }
        }
        if(min==Integer.MAX_VALUE){
            return -1;
        }
        return min;
    }
}//Time complexity is O(n)
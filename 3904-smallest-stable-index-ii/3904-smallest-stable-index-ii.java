class Solution {
    public int firstStableIndex(int[] nums, int k) {
        // easy logic maintain maxprefix and minsuffix
        // return -1 if no sol or send maxarr[i]-minarr[i]
        int n = nums.length;
        int[] maxarr = new int[nums.length];
        int[] minarr = new int[nums.length];

        int max = nums[0];
        int min = nums[n-1];

        for(int i=0;i<n;i++){
            
            max = Math.max(max,nums[i]);
            maxarr[i]= max;
        }

        for(int i=n-1;i>=0;i--){
            min = Math.min(min,nums[i]);
            minarr[i] = min;
        }

        
        for(int i=0;i<n;i++){
            if(maxarr[i]-minarr[i]<=k){
                return i;
            }
        }
        return -1;
        
    }
}//Time complexity is O(n)
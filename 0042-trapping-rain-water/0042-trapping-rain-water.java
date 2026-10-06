class Solution {
    public int trap(int[] height) {
    //Med logic u need to store thr left and right max elements 
    //the water stored at ith index is the min of righ/left - ith height   
        int n = height.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int max =Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            max = Math.max(max,height[i]);
            left[i]= max;
        }
        max =Integer.MIN_VALUE;
        for(int i=n-1;i>=0;i--){
            max = Math.max(max,height[i]);
            right[i]= max;
        }
        int ans =0;
        for(int i=0;i<n;i++){
            ans += Math.min(left[i],right[i])-height[i];
        }
        return ans;


        
    }
}//Time complexity is O(n)
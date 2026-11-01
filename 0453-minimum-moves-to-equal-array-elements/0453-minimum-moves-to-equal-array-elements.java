class Solution {
    public int minMoves(int[] nums) {
        // U need to choose the min and every step is diff of min and number
        int min = Integer.MAX_VALUE;
        for(int n:nums){
            min = Math.min(min,n);
        }
        int step = 0;
        for(int n:nums){
            step+= n - min;
        }
        return step;
    }
    
}//Time complexity is O(n)
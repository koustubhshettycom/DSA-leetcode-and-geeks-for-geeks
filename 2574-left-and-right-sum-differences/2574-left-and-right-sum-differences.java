class Solution {
    public int[] leftRightDifference(int[] arr) {
        // easy logic have left and right and put them into the index of the array 
        int left = 0;
        int right = 0;
        int[] ans = new int[arr.length];

        for(int i=0;i<arr.length;i++){
            right += arr[i];
        }
        for(int i=0;i<arr.length;i++){
            right = right - arr[i];
            ans[i] = Math.max(right,left) - Math.min(right,left);
            left = left + arr[i];
        }
        return ans;
        
    }
}// Time complexity O(n)
class Solution {
    public int[] concatWithReverse(int[] arr) {
        // easy logic add from the start and end 

        int[] ans = new int[arr.length*2];
        int n = arr.length;
        int start=0;
        int end = ans.length-1;
        while(start<=end){
            ans[start]= arr[start];
            ans[end] = arr[start];
            start++;end--;
        }
        
        return ans;
        
    }
}// Time complexity is O(n)
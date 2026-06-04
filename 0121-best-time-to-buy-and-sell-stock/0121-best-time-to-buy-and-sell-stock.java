class Solution {
    public int maxProfit(int[] arr) {
        // As they have asked to find max/min in a array partially uses kadane's algo logic
        int max = 0;
        int minprice = Integer.MAX_VALUE;

        for(int i=0;i<arr.length; i++){
            minprice = Math.min(arr[i],minprice);
            max = Math.max(max,arr[i]-minprice);
        }
        
        return max;
            


        
        
    }
}
// Time complexity is O(n)
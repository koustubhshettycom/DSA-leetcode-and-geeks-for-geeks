class Solution {
    public int minimumIndex(int[] arr, int itemSize) {
        // Easy logic 
        int min =Integer.MAX_VALUE;
        int idx =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>= itemSize && min>arr[i]){
                min = arr[i];
                idx =i;
            }
        }
        if(min == Integer.MAX_VALUE){
            min=0;
            idx =-1;
        }
        return idx;
        
    }
}// Time complexity is O(n)
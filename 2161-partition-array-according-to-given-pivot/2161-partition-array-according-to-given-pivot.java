class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        // easy logic maintain the freq of less more and equal
        // thn arrange them in arr according to pivot
        int n = nums.length;
        int[] arr = new int[n];
        int less =0;
        int more =0;
        int equal =0;

        for(int i=0;i<n;i++){
            if(nums[i]<pivot){
                less++;
            }
            else if(nums[i]==pivot){
                equal++;
            }
            else{
                more++;
            }
        }
        for(int i=less;i<less+equal;i++){
            arr[i]=pivot;

        }
        int idx = 0;
        int start=0;
        int mid = less;
        int end = less+equal;

        while(idx<n){
            if(nums[idx]<pivot){
                arr[start]=nums[idx];
                start++;
            }
            else if(nums[idx]==pivot){
                arr[mid]=nums[idx];
                mid++;
            }
            else{
                arr[end]=nums[idx];
                end++;
            }
            idx++;
        }

        return arr;

    }
}//Time complexity is O(n)
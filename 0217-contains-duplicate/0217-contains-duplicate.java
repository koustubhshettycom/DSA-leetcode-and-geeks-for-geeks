class Solution {
    public boolean containsDuplicate(int[] nums) {
        // logic is to sort the array and later compare one by one
      if (nums == null || nums.length <= 1) return false;

      divide( nums, 0, nums.length-1);
      for(int i=0; i<nums.length-1; i++){
        if(nums[i]==nums[i+1]){
            return true;

        }
        
      }
      return false;
    }
    private static void divide(int[] nums, int start, int end){
        if (start >= end) {  
            return;
        }
        int mid = start + (end -start)/2;
        divide(nums, start, mid);
        divide(nums, mid+1, end);
        merge(nums, start, end, mid);

    }
    private static void merge(int[] arr, int start , int end, int mid){
        int[] merged = new int[ end-start+1];
        int idx1 = start;
        int idx2 = mid+1;
        int x=0;
        while(idx1<= mid && idx2<= end){
            if(arr[idx1]>= arr[idx2]){
                merged[x]= arr[idx2];
                x++; idx2++;
            }
            else{
                merged[x]= arr[idx1];
                x++; idx1++;
            }
        }
        while(idx1<=mid){
            merged[x]= arr[idx1];
            x++; idx1++;
        }
        while(idx2<=end){
            merged[x]= arr[idx2];
            x++; idx2++;
        }
        for (int i = 0; i < merged.length; i++) {
            arr[start + i] = merged[i];
        }
        return ;
    }
}// Time complexity is o(nlog(n))
class Solution {
    public int firstStableIndex(int[] nums, int k) {
        // Logic is to get max and min for each i and get the diff and then compare with k 
       
        int index = -1;
        for(int i=0;i<nums.length;i++){
            int max = findmax(nums,i);
            int min = findmin(nums,i);
            int n = max-min;
            if(k>=n){
               return i;
            }

        }
        return index;
    }
    public int findmax(int[] arr, int index){
        int max = arr[index];
        for(int i=0;i<=index;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;


    }
     public int findmin (int [] arr, int index){
        int min = arr[index];
        for(int i = index;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
     }
}// Time complexity is O(n^2)
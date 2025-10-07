class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // its the second part of merge sorting after dividing use two pointer to compare 
        // there will be cases of running out of length check that too
        int[] arr = new int[m+n];
        int idx1 = 0;
        int idx2 = 0;
        int x =0;
        while(idx1<m && idx2<n){
            if(nums1[idx1]<=nums2[idx2]){
                arr[x]=nums1[idx1];
                x++; idx1++;
            }
            else{
                arr[x]=nums2[idx2];
                x++; idx2++;
            }
        }
        while(idx1<m){
            
            arr[x]=nums1[idx1];
            x++; idx1++;
        }
        while(idx2<n){
            
            arr[x]=nums2[idx2];
            x++; idx2++;
        }
        for (int i = 0; i < m + n; i++) {
            nums1[i] = arr[i];
        }
    }
}// Time complexity is O(n)
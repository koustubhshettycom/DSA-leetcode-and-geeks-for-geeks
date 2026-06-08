class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        //Easy logic just traverse through the nums such that u get common 
        //when u get it just return it or else return -1
        int idx1=0;
        int idx2=0;
        while(idx1<nums1.length && idx2 < nums2.length){
            if(nums1[idx1]==nums2[idx2]){
                return nums1[idx1];
            }
            else if(nums1[idx1]<nums2[idx2]){
                idx1++;
            }
            else if(nums1[idx1]>nums2[idx2]){
                idx2++;
            }
        }
        return -1;
        
    }
}// Time complexity O(n)
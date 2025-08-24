class Solution {
    public int numIdenticalPairs(int[] nums) {
        int no =0;
        //creating 2 loops one for traversing and one for adding
        for(int i=0;i<nums.length;i++){
           for(int j=0;j<nums.length;j++){
            if(nums[i]==nums[j] && i!=j && i<j){
                no++;
            }
           } 
        }
        return no;
    }
}
// Time complexity is bad O(n*n) 3/10 
//

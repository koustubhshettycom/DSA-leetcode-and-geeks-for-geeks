class Solution {
    public int countPairs(List<Integer> nums, int target) {
    // Tricky logic use 2 pointer after sorting 
    //if u find 2 points are lesser than target than
    // the point from left and points lesser than right are added to n
        Collections.sort(nums);
        int n=0;

        int start=0;
        int end = nums.size()-1;

        while(start<end){
            int sum = nums.get(end)+nums.get(start);

            if(sum<target){
                n += end-start;
                start++;
            }
            else{
                end--;
            }
        }
        return n;
    }
}// Time complexity is O(nlogn)
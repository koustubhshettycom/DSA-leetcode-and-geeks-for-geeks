class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        //Easy logic sort and get the indexes
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                list.add(i);
            }
        }
        return list;
    }
}//Time complexity is O(nlogn)
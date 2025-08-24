class Solution {
    public int[] buildArray(int[] nums) {
        int size = nums.length;
        //creating new array for convinece
        int[] arr = new int[size];
        // traversing and adding each and eevry element
        for(int i=0;i<nums.length;i++){
            arr[i] = nums[nums[i]];
        } 
        return arr;
    }
}
// Time complexity is great and is O(n) 9/10

class Solution {
    public int maxProduct(int[] nums) {
        // there are many approach this is the brute force one which is simple 
        // u are using builtin function instead of manual function and its ok ig
        // logic is to arrange the code by sorting later return product of last 2
        Arrays.sort(nums);
        return (nums[nums.length-1]-1)*(nums[nums.length-2]-1);
    }
}
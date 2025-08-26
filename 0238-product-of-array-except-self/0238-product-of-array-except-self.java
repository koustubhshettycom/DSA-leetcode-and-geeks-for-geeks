class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = 1;
        int count = Zeroes(nums);
        int[] arr = new int[nums.length];

        if (count == 0) {
            // No zero -> divide total product
            for (int i = 0; i < nums.length; i++) {
                product *= nums[i];
            }
            for (int i = 0; i < nums.length; i++) {
                arr[i] = product / nums[i];
            }
            return arr;
        }

        if (count == 1) {
            // One zero -> only index with zero gets product
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != 0) {
                    product *= nums[i];
                }
            }
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 0) {
                    arr[i] = product;
                } else {
                    arr[i] = 0;
                }
            }
            return arr;
        }

        // More than one zero -> all 0
        return arr; // already all 0
    }

    public static int Zeroes(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (num == 0) count++;
        }
        return count;
    }
}
// Time complexity is not good comparatively O(n*n) 5/10
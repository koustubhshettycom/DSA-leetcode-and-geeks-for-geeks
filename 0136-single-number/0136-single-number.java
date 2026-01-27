class Solution {
    public int singleNumber(int[] nums) {
        // property of XOR operator is that anything XOR'ed with itself is 0
        int num =0;
        for(int item: nums){
            num^=item;
        }
        return num;
        
    }
}
// Time complexity O(n)